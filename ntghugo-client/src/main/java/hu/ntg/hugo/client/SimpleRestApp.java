package hu.ntg.hugo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main entry point for the client-side JavaFX REST application. This loads the
 * JavaFX UI via a Spring-based application context and presents it to the user.
 */
public class SimpleRestApp {

    private static final Logger log = LoggerFactory.getLogger(SimpleRestApp.class);

    /**
     * Main entry point called when the application starts. This follows the
     * typical JavaFX pattern of delegating straight to the Application.launch
     * method, which then triggers the start() method below.
     *
     * @param args any line arguments passed to the application at startup. This
     * may be from the command line or from the the launch file if called from
     * Webstart or an Applet, etc.
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Main JavaFX initialisation method which is called indirectly by the
     * main() method above on startup. This method loads the user interface from
     * a Spring-based application context and adds it to the provided Stage.
     *
     * @param stage the main Stage (i.e. Window) that the application is to run
     * within.
     */
    public static void start() {
        log.info("Starting SimpleRestApp application");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleRestAppFactory.class);
        WelcomeController mainController = context.getBean(WelcomeController.class);
        String msg = mainController.sayHello("Krisz").getMessage();
        log.info("Welcome Controler says: " + msg);
    }
}
