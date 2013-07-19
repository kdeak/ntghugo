package hu.ntg.hugo.client;

import hu.ntg.hugo.common.WelcomeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WelcomeController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);
    @Autowired
    private WelcomeRestService welcomeRestService;

    public WelcomeMessage sayHello(String name) {
        return welcomeRestService.sayHello(name);
    }
}
