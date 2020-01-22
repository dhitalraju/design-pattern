package np.raju.design.patterns.abstractfactory;


import np.raju.design.patterns.factory.ShapeType;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class NormalShapeFactory extends AbstractFactory {
  @Override
  Shape getShape(ShapeType shapeType) {
    switch (shapeType) {
      case Circle:
        return new Circle();
      case Square:
        return new Square();
      case Rectangle:
        return new Rectangle();
      default:
        return null;
    }
  }
}
