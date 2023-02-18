package cn.zhaim.springframework.beans.factory.support;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.core.io.Resource;
import cn.zhaim.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry  getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
