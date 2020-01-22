package np.raju.design.patterns.builder;

import np.raju.design.patterns.utils.LoggerUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajudhital on 1/22/20
 * @project design-patterns
 */
public class Meal {

  private List<Item> items;

  public Meal() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void display() {
    items.forEach(item -> {
      LoggerUtils.log("ITEM NAME :: " + item.getName());
      LoggerUtils.log("PRICE :: " + item.getPrice());
      LoggerUtils.log("PACKING :: " + item.getPacking().getPacking());
    });
  }

  public float getMealCost() {
    float cost = 0.0f;
    for (Item item : items) {
      cost += item.getPrice();
    }
    return cost;
  }
}
