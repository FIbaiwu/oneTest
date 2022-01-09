package com.bjpowernode.service.impl;

import com.bjpowernode.domain.SsmUsers;
import com.bjpowernode.mapper.SsmUsersMapper;
import com.bjpowernode.service.SsmUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SsmUsersServiceImpl implements SsmUsersService {
    @Resource
    private SsmUsersMapper mapper;
    @Override
    public List<SsmUsers> findUserPage(String userName, String userSex, Integer page) {
        return mapper.selectUserPage(userName, userSex, page);
    }

    @Override
    public Integer findRowCount(String userName, String userSex) {
        return mapper.getRowCount(userName, userSex);
    }

    @Override
    public Integer removeUserById(String userId) {
        return mapper.deleteUserById(userId);
    }

    @Override
    public Integer addUser(SsmUsers user) {
        return mapper.insertUser(user);
    }

    @Override
    public Integer modifyUser(SsmUsers users) {
        return mapper.updateUser(users);
    }

    @Override
    public Integer removeUserByIdList(List<String> id) {
        return mapper.deleteUserByIdList(id);
    }
}
