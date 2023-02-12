package cn.zhaim.springframework.beans.factory;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.zhaim.springframework.beans.factory.config.BeanDefinition;
import cn.zhaim.springframework.beans.factory.config.BeanPostProcessor;
import cn.zhaim.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author zhaimeng
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
