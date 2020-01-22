package np.raju.design.patterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** @author raju.dhital@citytech.global on 2020-01-22 19:41 project design-patterns */
class ShapeFactoryTest {

  @Test
  void factoryTest() {
    Shape shape = ShapeFactory.getShape(ShapeType.Rectangle);
    shape.draw();
    Assertions.assertSame(shape.getClass(), Rectangle.class);
  }
}
