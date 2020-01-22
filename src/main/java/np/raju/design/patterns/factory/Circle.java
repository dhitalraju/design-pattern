package np.raju.design.patterns.factory;

import np.raju.design.patterns.utils.LoggerUtils;

/** @author raju.dhital@citytech.global on 2020-01-22 14:20 project design-patterns */
public class Circle implements Shape {
  @Override
  public void draw() {
    LoggerUtils.log("CIRCLE DRAWN :: ");
  }
}
