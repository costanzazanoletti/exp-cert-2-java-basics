package org.learning.oop.abstraction.animals;

public class Cat extends Animal {

  private String favoriteToy;

  public Cat(String name, String favoriteToy) {
    super(name);
    this.favoriteToy = favoriteToy;
  }

  @Override
  public void makeNoise() {
    System.out.println("Meow");
  }

  @Override
  public boolean eat(String food) throws IllegalArgumentException {
    if (food == null || food.isEmpty()) {
      throw new IllegalArgumentException("Invalid food");
    }
    boolean isFed = Math.random() > 0.5;
    if (isFed) {
      return false;
    }
    System.out.println("I'm eating " + food);
    return true;
  }

  public void play() {
    System.out.println("I'm playng with " + favoriteToy);
  }
}
