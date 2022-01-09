package com.bjpowernode.service;

import com.bjpowernode.domain.SsmUsers;

import java.util.List;

public interface SsmUsersService {

    List<SsmUsers> findUserPage(String userName, String userSex, Integer page);
    Integer findRowCount(String userName,String userSex);

    Integer removeUserById(String userId);
}
