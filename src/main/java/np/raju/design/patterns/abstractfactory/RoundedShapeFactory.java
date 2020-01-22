package np.raju.design.patterns.abstractfactory;

import np.raju.design.patterns.factory.ShapeType;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class RoundedShapeFactory extends AbstractFactory {
  @Override
  Shape getShape(ShapeType shapeType) {
    if (shapeType == ShapeType.Circle) {
      return new Circle();
    }
    return null;
  }
}
