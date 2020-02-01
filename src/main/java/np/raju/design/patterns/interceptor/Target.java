package np.raju.design.patterns.interceptor;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class Target {

  public void execute(String request) {
    System.out.println("EXECUTING ON TARGET :: " + request);
  }
}
