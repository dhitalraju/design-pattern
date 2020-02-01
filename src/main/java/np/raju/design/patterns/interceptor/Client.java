package np.raju.design.patterns.interceptor;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class Client {

  private FilterManager filterManager;

  public Client(FilterManager filterManager) {
    this.filterManager = filterManager;
  }

  public void sendRequest(String request) {
    this.filterManager.filterRequest(request);
  }
}
