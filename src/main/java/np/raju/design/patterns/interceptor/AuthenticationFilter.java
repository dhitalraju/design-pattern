package np.raju.design.patterns.interceptor;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class AuthenticationFilter implements Filter {

  @Override
  public void execute(String request) {
    System.out.println("STARTED WITH AUTHENTICATION FILTER ::: " + request);
  }
}
