package Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        logger.info("收到自定义事件MyEvent");
    }
}
