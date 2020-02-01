package np.raju.design.patterns.interceptor;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class FilterManager {

  private FilterChain filterChain;

  public FilterManager(Target target) {
    filterChain = new FilterChain();
    filterChain.setTarget(target);
  }

  public void filterRequest(String request) {
    this.filterChain.execute(request);
  }

  public void setFilter(Filter filter) {
    this.filterChain.addFilter(filter);
  }
}
