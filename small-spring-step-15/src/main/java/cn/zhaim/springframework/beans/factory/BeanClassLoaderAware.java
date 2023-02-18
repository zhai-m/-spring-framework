package cn.zhaim.springframework.beans.factory;


/**
 * @author zhaimeng
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}


    