package np.raju.design.patterns.builder;

import np.raju.design.patterns.utils.LoggerUtils;
import org.junit.jupiter.api.Test;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
class MealBuilderTest {

  @Test
  void testBuilder() {
    Meal vegMeal = MealBuilder.prepareVegMeal();
    vegMeal.display();
    LoggerUtils.log("TOTAL COST ::: " + vegMeal.getMealCost());
    Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
    nonVegMeal.display();
    LoggerUtils.log("TOTAL COST NON VEG ::: " + nonVegMeal.getMealCost());
  }

}