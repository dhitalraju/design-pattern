package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public abstract class ColdDrink implements Item {
  @Override
  public Packing getPacking() {
    return new Bottle();
  }
}
