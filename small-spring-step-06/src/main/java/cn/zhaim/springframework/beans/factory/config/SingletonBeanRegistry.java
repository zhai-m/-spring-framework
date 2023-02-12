package cn.zhaim.springframework.beans.factory.config;

/**
 * @author zhaimeng
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
