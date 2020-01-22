package np.raju.design.patterns.builder;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class MealBuilder {

  public static Meal prepareNonVegMeal() {
    Meal nonVeg = new Meal();
    nonVeg.addItem(new CheeseBurger());
    nonVeg.addItem(new CocoCola());
    return nonVeg;
  }

  public static Meal prepareVegMeal() {
    Meal vegMeal = new Meal();
    vegMeal.addItem(new VegBurger());
    vegMeal.addItem(new Pepsi());
    return vegMeal;
  }
}
