package cn.zhaim.springframework.context.event;

import cn.zhaim.springframework.context.ApplicationContext;
import cn.zhaim.springframework.context.ApplicationEvent;

public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public ApplicationContext getApplicationContent() {
        return (ApplicationContext) getSource();
    }
}
