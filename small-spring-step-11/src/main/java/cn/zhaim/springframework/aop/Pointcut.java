package cn.zhaim.springframework.aop;

public interface Pointcut {

    ClassFilter getClassFile();

    MethodMatcher getMethodMatcher();
}
