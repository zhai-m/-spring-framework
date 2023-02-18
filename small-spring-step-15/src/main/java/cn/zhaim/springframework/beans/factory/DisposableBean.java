package cn.zhaim.springframework.beans.factory;

public interface DisposableBean {

    void destroy() throws Exception;
}
