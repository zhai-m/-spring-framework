package cn.zhaim.springframework.beans.factory;

public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
