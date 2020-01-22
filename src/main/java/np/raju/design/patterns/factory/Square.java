package np.raju.design.patterns.factory;

import np.raju.design.patterns.utils.LoggerUtils;

/** @author raju.dhital@citytech.global on 2020-01-22 19:34 project design-patterns */
public class Square implements Shape {
  @Override
  public void draw() {
    LoggerUtils.log("SQUARE DRAWN ::");
  }
}
