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
//    /user/createUser(参数见下面)
    /**
     * cardType: this.ruleForm.cardType,//证件类型
     *     cardNo: this.ruleForm.cardNo,//证件号码
     *     userName: this.ruleForm.userName,//用户姓名
     *     userSex: this.ruleForm.userSex,//用户性别
     * userAge: this.ruleForm.userAge,//用户年龄
     * userRole: this.ruleForm.userRole,//用户角色
     */


    Integer insertUser(SsmUsers users);

    /**
     * url	/user/updateUserById(参数见以下)
     * userId: this.ruleForm.userId,//用户 Id
     * cardType: this.ruleForm.cardType,//证件类型
     * cardNo: this.ruleForm.cardNo,//证件号码
     * userName: this.ruleForm.userName,//用户姓名
     * userSex: this.ruleForm.userSex,//用户性别
     * userAge: this.ruleForm.userAge,//用户年龄
     * userRole: this.ruleForm.userRole,//用户角色
     */
    Integer updateUser(SsmUsers user);

    /**
     * /user/deleteUserByIdList (list userIdList)
     */
    Integer deleteUserByIdList(List<String> idList);
}
