package org.learning.oop.abstraction.animals;

public class Duck extends Animal implements CanFly, CanSwim {

  public Duck(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Quack");
  }

  @Override
  public boolean eat(String food) throws IllegalArgumentException {
    System.out.println("I'm eating something");
    return true;
  }

  @Override
  public void fly() {
    System.out.println("I'm a flying duck");
  }

  @Override
  public void swim() {
    System.out.println("I'm a swimming duck");
  }
}
