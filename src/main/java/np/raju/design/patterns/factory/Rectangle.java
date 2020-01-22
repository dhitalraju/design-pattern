package np.raju.design.patterns.factory;

import np.raju.design.patterns.utils.LoggerUtils;

/** @author raju.dhital@citytech.global on 2020-01-22 19:33 project design-patterns */
public class Rectangle implements Shape {
  @Override
  public void draw() {
    LoggerUtils.log("RECTANGLE DRAWN ::");
  }
}
