import DAO.Impl.UserDao;
import JavaBean.User;
import org.junit.Test;

public class UserDaoTest {
    UserDao udao=new UserDao();
    @Test
    public void testCreateUser(){
        User user=new User();
        user.setId(1) ;
        user.setUserName("XiaoMing");
        user.setAge(20);
        user.setPassword("123456");
        user.setSrx(true);

        udao.save(user);
    }
    @Test
    public void TestUpdateUser(){
        User us=new User();
        us.setId(1);
        us.setUserName("小明");

        udao.update(us);
    }
}

