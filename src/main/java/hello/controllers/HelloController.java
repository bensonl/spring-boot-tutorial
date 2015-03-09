package hello.controllers;

import hello.services.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bliu on 3/7/15.
 */
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String index() {
        log.info("index action begin");
        return helloWorldService.helloWorld();
    }

}
