package hu.ntg.hugo.client;

import hu.ntg.hugo.client.business.RestService;
import hu.ntg.hugo.common.WelcomeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides a convenience wrapper around all REST calls to the remote server.
 * Other classes in the project can use this to perform remote procedure calls
 * without worrying about the messy business of URL and String mangling. Under
 * the covers this class uses Spring's RestTemplate to simplify the task of
 * talking to the server. For more information on Spring's RestTemplate see:
 * http://blog.springsource.com/2009/03/27/rest-in-spring-3-resttemplate/
 */
public class WelcomeRestService extends RestService {

    /**
     * Constructs a new instance of this service so that it will provide access
     * to the REST methods made available by the server at the URL provided.
     */
    public WelcomeRestService() {
    }

    /**
     * Makes a remote REST call to the server, invoking the 'welcome' method.
     * This handles the job of building the appropriate server URL (passing the
     * name as a parameter) and then unmarshaling the result. If there is any
     * problem connecting to the server or reading the response then an
     * appropriate exception is thrown by this method.
     *
     * @param name the name of the person saying hello. This is passed to the
     * server as part of the REST URL.
     * @return the response from the server. We could have gotten away with a
     * simple String result here but it is more interesting to show a regular
     * Java object being returned.
     */
    public WelcomeMessage sayHello(String name) {
        log.info("Saying hello to server using name: {}", name);
        Map<String, Object> values = new HashMap<>();
        values.put("name", name);
        WelcomeMessage welcomeMessage = restTemplate.getForObject(
                serverUrl + "/welcome?name={name}", WelcomeMessage.class, values);
        log.info("Server responded with: {}", welcomeMessage.getMessage());
        return welcomeMessage;
    }
}
