package cn.zhaim.springframework.beans.factory.support;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.config.BeanDefinition;

public class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected BeanDefinition getBeanDefinition(String name) {
        return null;
    }

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
           bean =  beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException  | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName,beanDefinition);
        return bean;
    }
}
