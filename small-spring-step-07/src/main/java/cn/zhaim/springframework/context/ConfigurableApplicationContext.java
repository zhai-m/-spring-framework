package cn.zhaim.springframework.context;

import cn.zhaim.springframework.beans.BeansException;

/**
 * @author ZhaiMeng
 * @version 1.0
 * @date 2023/2/12 12:58
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */

    void refresh() throws BeansException;
}
