package com.bjpowernode.mapper;

import com.bjpowernode.domain.SsmUsers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsmUsersMapper {
//    /user/selectUserPage?
//    userName=z&
//    userSex=男&
//    page=null
//    根据条件分页获取分页数据
    List<SsmUsers> selectUserPage(@Param("userName") String userName,@Param("userSex") String userSex,@Param("page") Integer page);
//    获取总行数  /user/getRowCount?
//    userName=z&
//    userSex=男
    Integer getRowCount(@Param("userName") String userName, @Param("userSex") String userSex);

    //    根据用户ID删除用户
//    /user/ deleteUserById?userId= 15968162087363060
    Integer deleteUserById(String userId);

}
