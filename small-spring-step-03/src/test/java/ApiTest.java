import bean.UserService;
import cn.zhaim.springframework.beans.factory.config.BeanDefinition;
import cn.zhaim.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        //1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        // 3.第一次获取 bean
        UserService  userService= (UserService) beanFactory.getBean("userService","小盟哥");
        userService.queryUserInfo();

    }
}
