package np.raju.design.patterns.interceptor;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class InterceptorDemo {

  public static void main(String[] args) {
    FilterManager filterManager = new FilterManager(new Target());
    filterManager.setFilter(new AuthenticationFilter());
    filterManager.setFilter(new DebugFilter());

    Client client = new Client(filterManager);
    client.sendRequest("HOME");
  }
}
