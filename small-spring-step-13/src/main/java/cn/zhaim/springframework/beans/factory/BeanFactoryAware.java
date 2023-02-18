package cn.zhaim.springframework.beans.factory;

import cn.zhaim.springframework.beans.BeansException;


/**
 * @author zhaimeng
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
