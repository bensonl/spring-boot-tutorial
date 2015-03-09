package hello.services.impl;

import hello.services.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bliu on 3/8/15.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    public String helloWorld() {
        log.debug("helloWorld - begin");
        return "Hello World!";
    }
}
