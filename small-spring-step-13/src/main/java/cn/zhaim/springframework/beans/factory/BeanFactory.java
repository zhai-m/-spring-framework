package cn.zhaim.springframework.beans.factory;

import cn.zhaim.springframework.beans.BeansException;

/**
 * @author zhaimeng
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
