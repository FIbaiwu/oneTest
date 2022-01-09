package com.bjpowernode.controller;
import com.bjpowernode.domain.SsmUsers;
import com.bjpowernode.service.SsmUsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RequestMapping("/user")
@RestController
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
            return list;
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
//    /user/createUser
    @RequestMapping("/createUser")
    public Integer addUser(SsmUsers users){
        int num = (new Random().nextInt(9000)+1000);
        String id = System.currentTimeMillis()+ String.valueOf(num);
        users.setUserId(id);
        return  service.addUser(users);
    }
//    /user/updateUserById(参数见以下)
    @RequestMapping("/updateUserById")
    public Integer updateUserById(SsmUsers users){
        return service.modifyUser(users);
    }
    /**
     *  /user/deleteUserByIdList (list userIdList)
     */
    @RequestMapping("/deleteUserByIdList")
    public Integer deleteUserByIdList(String userIdList){
        String userIdListSub = userIdList.substring(0, userIdList.length()-1);
        List userId = new ArrayList();
        for (String userIdListtr: userIdListSub.split(",")){
            userId.add(userIdListtr.trim());
        }
        return service.removeUserByIdList(userId);
    }
}

