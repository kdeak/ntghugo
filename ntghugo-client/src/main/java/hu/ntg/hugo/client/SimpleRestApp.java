package hu.ntg.hugo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main entry point for the client-side REST application. This loads the
 * Spring-based application context and presents it to the user.
 */
public class SimpleRestApp {

    private static final Logger log = LoggerFactory.getLogger(SimpleRestApp.class);

    /**
     * Main entry point called when the application starts.
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Main method which is called indirectly by the main() method above on
     * startup. This method loads the Spring-based application context.
     */
    public static void start() {
        log.info("Starting SimpleRestApp application");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleRestAppFactory.class);
        WelcomeController mainController = context.getBean(WelcomeController.class);
        String msg = mainController.sayHello("Krisz").getMessage();
        log.info("Welcome Controler says: " + msg);
    }
}
