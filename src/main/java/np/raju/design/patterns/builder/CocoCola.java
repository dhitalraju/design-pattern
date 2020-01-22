package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class CocoCola extends ColdDrink {
  @Override
  public String getName() {
    return "COKE";
  }

  @Override
  public Float getPrice() {
    return 5.0f;
  }
}
