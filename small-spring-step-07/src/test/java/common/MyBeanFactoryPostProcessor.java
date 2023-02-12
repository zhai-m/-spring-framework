package common;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.PropertyValue;
import cn.zhaim.springframework.beans.PropertyValues;
import cn.zhaim.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.zhaim.springframework.beans.factory.config.BeanDefinition;
import cn.zhaim.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/12 12:59
 */
public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
