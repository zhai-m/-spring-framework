package bean;

import cn.zhaim.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/18 15:31
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}
