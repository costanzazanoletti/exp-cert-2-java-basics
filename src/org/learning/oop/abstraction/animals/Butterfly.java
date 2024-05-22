package org.learning.oop.abstraction.animals;

public class Butterfly extends Animal implements CanFly {

  public Butterfly(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Flap flap");
  }

  @Override
  public boolean eat(String food) throws IllegalArgumentException {
    System.out.println("I'm eating " + food);
    return true;
  }

  @Override
  public void fly() {
    System.out.println("I'm a butterfly and I fly");
  }
}
