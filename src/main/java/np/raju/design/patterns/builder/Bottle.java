package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class Bottle implements Packing {
  @Override
  public String getPacking() {
    return "BOTTLE";
  }
}
