package org.learning.oop.abstraction.animals;

public class Cow extends Animal {

  private final static String[] FOODS = {"grass", "corn"};

  public Cow(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Mooooh");
  }

  @Override
  public boolean eat(String food) throws IllegalArgumentException {
    if (food == null || food.isEmpty()) {
      throw new IllegalArgumentException("Invalid food");
    }
    for (int i = 0; i < FOODS.length; i++) {
      if (FOODS[i].equals(food)) {
        return true;
      }
    }
    return false;
  }

  public void makeMilk() {
    System.out.println("I'm making milk");
  }
}
