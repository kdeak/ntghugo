package hu.ntg.hugo.client.business;

import hu.ntg.hugo.client.WelcomeRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author kdeak
 */
public class RestService {

    protected static final Logger log = LoggerFactory.getLogger(WelcomeRestService.class);
    /**
     * This RestTemplate is a Spring helper class that simplifies the job of
     * making remote calls REST onto the server. It is marked as
     *
     * @Autowired, which means that Spring will magically wire in a RestTemplate
     * at runtime when this service is loaded from an ApplicationContext (see
     * the SimpleRestAppFactory).
     */
    @Autowired
    protected RestTemplate restTemplate;
    /**
     * This is a configuration property that allows us to define the base server
     * URL to use at runtime. This is ultimately loaded from the
     * client.properties file but Spring allows us to hide a lot of this and we
     * just deal with a nice simple String here.
     * <p/>
     * By default the URL will point to 'http://localhost:8080/ntghugo-server'
     * which should hit your local web server if you run it using the default
     * settings of this project. When deploying to a real world environment, you
     * should change the properties file to match your actual server URL.
     */
    @Autowired
    protected String serverUrl;
}
