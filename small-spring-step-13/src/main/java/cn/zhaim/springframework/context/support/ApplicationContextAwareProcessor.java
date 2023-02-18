package cn.zhaim.springframework.context.support;


import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.config.BeanPostProcessor;
import cn.zhaim.springframework.context.ApplicationContext;
import cn.zhaim.springframework.context.ApplicationContextAware;


/**
 * @author zhaimeng
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
