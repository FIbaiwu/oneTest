package com.bjpowernode.controller;

import com.bjpowernode.domain.SsmUsers;
import com.bjpowernode.service.SsmUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Integer PAGE_BROWING = 5;
    @Resource
    private SsmUsersService service;
    @RequestMapping("/selectUserPage")
    public List<SsmUsers> selectUserPage(String userName,String userSex, Integer page){
        int startpage = 0;
        List<SsmUsers> list = null;
        if(page ==null){
            list = service.findUserPage(userName, userSex, startpage);
        }

        startpage = (page -1)* PAGE_BROWING;
        list = service.findUserPage(userName, userSex, startpage);
        return list;
    }
    @RequestMapping("/getRowCount")
        public Integer getRowCount(String userName,String userSex){
        Integer count = service.findRowCount(userName, userSex);
        return count;
    }
//    //user/ deleteUserById?userId= 15968162087363060
    @RequestMapping("/deleteUserById")
    public Integer deleteUserById(String userId){
        Integer result = service.removeUserById(userId);
        return result;
    }
}
