package hello.controllers;

import hello.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bliu on 3/7/15.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String index() {
//        return "Greetings from Spring Boot!";
        return helloWorldService.helloWorld();
    }

}
