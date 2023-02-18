import bean.IUserService;
import bean.UserService;
import bean.UserServiceInterceptor;
import cn.zhaim.springframework.aop.AdvisedSupport;
import cn.zhaim.springframework.aop.TargetSource;
import cn.zhaim.springframework.aop.aspecjt.AspectJExpressionPointcut;
import cn.zhaim.springframework.aop.framework.Cglib2AopProxy;
import cn.zhaim.springframework.aop.framework.JdkDynamicAopProxy;
import org.junit.Test;

import java.lang.reflect.Method;

public class ApiTest {

    @Test
    public void test_aop() throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* bean.UserService.*(..))");
        Class<UserService> clazz = UserService.class;
        Method method= clazz.getDeclaredMethod("queryUserInfo");

        System.out.println(pointcut.matches(clazz));
        System.out.println(pointcut.matches(method,clazz));
    }


    @Test
    public void test_dynamic() {
        UserService userService = new UserService();
        AdvisedSupport advisedSupport = new AdvisedSupport();

        advisedSupport.setTargetSource(new TargetSource(userService));
        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* bean.UserService.*(..))"));
        IUserService proxy_jdk = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();

        System.out.println(proxy_jdk.queryUserInfo());

        IUserService proxy_cglib = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();

        System.out.println(proxy_cglib.register("寂寞不说爱"));


    }

}
