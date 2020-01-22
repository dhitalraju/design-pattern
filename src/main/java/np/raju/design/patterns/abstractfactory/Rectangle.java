package np.raju.design.patterns.abstractfactory;

import np.raju.design.patterns.utils.LoggerUtils;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class Rectangle implements Shape {
  @Override
  public void draw() {
    LoggerUtils.log("ABSTRACT :: RECTANGLE DRAWN");
  }
}
