package np.raju.design.patterns.factory;

/** @author raju.dhital@citytech.global on 2020-01-22 19:35 project design-patterns */
public class ShapeFactory {

  private ShapeFactory() {}

  public static Shape getShape(ShapeType shapeType) {
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
