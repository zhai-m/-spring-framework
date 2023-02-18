package cn.zhaim.springframework.context;

import cn.zhaim.springframework.beans.BeansException;
import cn.zhaim.springframework.beans.factory.Aware;


/**
 * @author zhaimeng
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
    