package cn.zhaim.springframework.context;

import cn.zhaim.springframework.beans.factory.HierarchicalBeanFactory;
import cn.zhaim.springframework.beans.factory.ListableBeanFactory;
import cn.zhaim.springframework.core.io.ResourceLoader;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/12 12:57
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader,ApplicationEventPublisher {

}
