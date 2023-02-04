package cn.zhaim.springframework.beans.factory;

import cn.zhaim.springframework.beans.BeansException;

/**
 * @author zhaimeng
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
