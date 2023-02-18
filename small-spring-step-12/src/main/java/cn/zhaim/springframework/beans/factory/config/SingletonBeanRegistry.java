package cn.zhaim.springframework.beans.factory.config;

import cn.zhaim.springframework.context.event.ApplicationEventMulticaster;

/**
 * @author zhaimeng
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
