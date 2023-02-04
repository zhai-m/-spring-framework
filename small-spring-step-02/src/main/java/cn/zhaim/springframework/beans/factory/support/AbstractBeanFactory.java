package cn.zhaim.springframework.beans.factory.support;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.BeanFactory;
import cn.zhaim.springframework.beans.factory.config.BeanDefinition;

/**
 * @author zhaimeng
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String name);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
