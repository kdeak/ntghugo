package hu.ntg.hugo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WelcomeController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);
    @Autowired
    private WelcomeRestService welcomeRestService;

    public String sayHello() {
        return "Hello";
    }
}
