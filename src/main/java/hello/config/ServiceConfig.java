package hello.config;

import hello.services.HelloWorldService;
import hello.services.MessageService;
import hello.services.impl.HelloWorldServiceImpl;
import hello.services.impl.MessageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bliu on 3/8/15.
 */
@Configuration
public class ServiceConfig {

    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldServiceImpl();
    }

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }
}
