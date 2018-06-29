import com.lingnan.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceClientTest {

    private ApplicationContext context;
    @Test
    public void test(){
        this.context = new ClassPathXmlApplicationContext("spring/app-*.xml");
        IUserService userService = (IUserService) this.context.getBean("userServiceClient");
        userService.login("aa", "aa");


    }
}
