package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class Pepsi extends ColdDrink {
  @Override
  public String getName() {
    return "PEPSI";
  }

  @Override
  public Float getPrice() {
    return 6.0f;
  }
}
