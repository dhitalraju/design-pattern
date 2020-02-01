package np.raju.design.patterns.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajudhital on 2/1/20
 * @project design-patterns
 */
public class FilterChain {

  private List<Filter> filters = new ArrayList<>();
  private Target target;

  public void addFilter(Filter filter) {
    this.filters.add(filter);
  }

  public void execute(String request) {
    this.filters.forEach(filter -> filter.execute(request));
    this.target.execute(request);
  }

  public void setTarget(Target target) {
    this.target = target;
  }
}
