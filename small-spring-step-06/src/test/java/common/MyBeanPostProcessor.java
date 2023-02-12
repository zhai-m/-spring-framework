package common;

import bean.UserService;
import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/12 12:59
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
