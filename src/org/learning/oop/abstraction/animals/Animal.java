package org.learning.oop.abstraction.animals;

public abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void sleep() {
    System.out.println("ZZZZzzzzzzz");
  }

  // metodo astratto
  public abstract void makeNoise();

  public abstract boolean eat(String food) throws IllegalArgumentException;
}
