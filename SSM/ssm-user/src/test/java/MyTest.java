import com.bjpowernode.domain.SsmUsers;
import com.bjpowernode.mapper.SsmUsersMapper;
import com.bjpowernode.service.SsmUsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_Service.xml","classpath:applicationContext_Mapper.xml"})
public class MyTest {
    @Resource
    private SsmUsersService service;
    @Test
    public void testFindUserPage(){
        List<SsmUsers> users = service.findUserPage("", "", 10);
        users.forEach(user-> System.out.println(user));
    }
//    Integer getRowCount(@Param("userName") String userName, @Param("userSex") String userSex);
    @Test
    public void testGetRowCount(){
        Integer  i = service.findRowCount("", "女");
        System.out.println(i);
    }
    @Test
    public void testRemoveUserById(){
        Integer result = service.removeUserById("15968954638794962");
        System.out.println(result);
    }
    @Test
    public void testaddUser(){
//        1596894412386 9023
//          1641706339104
        int num = (new Random().nextInt(9000)) + 1000;
        String id = System.currentTimeMillis()+String.valueOf(num);
        SsmUsers u = new SsmUsers();
        u.setUserId(id);    //id
        u.setCardType("身份证");     //证件类型
        u.setCardNo("11111111");       //证件号码
        u.setUserName("张飞");     //用户姓名
        u.setUserSex("男");        //用户性别
        u.setUserAge("18");      //用户年龄
        u.setUserRole("医生");      //用户角色
        Integer result = service.addUser(u);
        System.out.println(result);
    }
    @Test
    public void testModifyUser(){
//        1596894412386 9023
//          1641706339104
        int num = (new Random().nextInt(9000)) + 1000;
        String id = String.valueOf(16417078248859278L);
        System.out.println(id);
        SsmUsers u = new SsmUsers();
        u.setUserId(id);    //id
        u.setCardType("身份证");     //证件类型
        u.setCardNo("11111111");       //证件号码
        u.setUserName("刘备");     //用户姓名
        u.setUserSex("男");        //用户性别
        u.setUserAge("18");      //用户年龄
        u.setUserRole("医生");      //用户角色
        Integer result = service.modifyUser(u);
        System.out.println(result);
    }
    @Test
    public void testRemoveUserByIdList(){
        List list = new ArrayList();
        list.add("16417086923274010");
        Integer integer = service.removeUserByIdList(list);
        System.out.println(integer);
    }
}
