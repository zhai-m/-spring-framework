package cn.zhaim.springframework.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
