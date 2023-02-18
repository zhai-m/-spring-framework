package cn.zhaim.springframework.context.support;

import cn.zhaim.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.zhaim.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/12 12:56
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory,this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
