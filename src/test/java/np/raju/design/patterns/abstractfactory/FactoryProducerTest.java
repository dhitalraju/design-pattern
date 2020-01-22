package np.raju.design.patterns.abstractfactory;

import np.raju.design.patterns.factory.ShapeType;
import org.junit.jupiter.api.Test;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
class FactoryProducerTest {

  @Test
  void testAbstractFactory() {
    AbstractFactory factory = FactoryProducer.getFactory(true);
    Shape shape = factory.getShape(ShapeType.Circle);
    shape.draw();
  }

}