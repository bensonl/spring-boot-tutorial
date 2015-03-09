package hello.config;

import hello.controllers.HelloController;
import hello.controllers.MessageController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bliu on 3/8/15.
 */
@Configuration
public class ControllerConfig {

    @Bean
    public HelloController helloController() {
        return new HelloController();
    }

    @Bean
    public MessageController messageController() {
        return new MessageController();
    }
}
