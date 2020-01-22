package np.raju.design.patterns.abstractfactory;

import np.raju.design.patterns.factory.ShapeType;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public abstract class AbstractFactory {
  abstract Shape getShape(ShapeType shapeType);
}
