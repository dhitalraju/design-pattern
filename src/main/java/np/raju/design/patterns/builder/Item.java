package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public interface Item {

  String getName();

  Packing getPacking();

  Float getPrice();

}
