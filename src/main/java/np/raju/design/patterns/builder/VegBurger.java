package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class VegBurger extends Burger {
  @Override
  public String getName() {
    return "VEG BURGER";
  }

  @Override
  public Float getPrice() {
    return 10.0f;
  }
}
