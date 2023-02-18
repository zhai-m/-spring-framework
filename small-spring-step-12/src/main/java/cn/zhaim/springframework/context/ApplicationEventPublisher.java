package cn.zhaim.springframework.context;

public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);


}
