package Listener;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    MyEvent(Object source) {
        super(source);
    }
}
