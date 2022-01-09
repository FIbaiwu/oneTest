import com.bjpowernode.domain.SsmUsers;
import com.bjpowernode.mapper.SsmUsersMapper;
import com.bjpowernode.service.SsmUsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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
}
