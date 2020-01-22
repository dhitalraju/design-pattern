package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class CheeseBurger extends Burger {
  @Override
  public String getName() {
    return "CHEESE BURGER";
  }

  @Override
  public Float getPrice() {
    return 15.0f;
  }
}
