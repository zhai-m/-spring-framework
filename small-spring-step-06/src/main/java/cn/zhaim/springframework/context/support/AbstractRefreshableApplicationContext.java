package cn.zhaim.springframework.context.support;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.zhaim.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/12 12:56
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return (ConfigurableListableBeanFactory) beanFactory;
    }
}
