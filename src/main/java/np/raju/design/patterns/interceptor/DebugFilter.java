package np.raju.design.patterns.interceptor;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class DebugFilter implements Filter {
  @Override
  public void execute(String request) {
    System.out.println("DEBUG FILTER :::: " + request);
  }
}
