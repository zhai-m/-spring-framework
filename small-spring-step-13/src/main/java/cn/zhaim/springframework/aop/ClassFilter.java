package cn.zhaim.springframework.aop;

public interface ClassFilter {

   boolean matches(Class<?> clazz);
}
