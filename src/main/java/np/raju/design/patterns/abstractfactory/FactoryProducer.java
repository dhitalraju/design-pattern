package np.raju.design.patterns.abstractfactory;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class FactoryProducer {

  private FactoryProducer() {

  }

  public static AbstractFactory getFactory(boolean isRounded) {
    if (isRounded) {
      return new RoundedShapeFactory();
    }
    return new NormalShapeFactory();
  }
}
