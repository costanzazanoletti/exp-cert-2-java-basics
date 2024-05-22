package org.learning.oop.abstraction.animals;

public class AnimalGame {

  public static void main(String[] args) {
    //Animal a = new Animal("aaa");
    Animal[] zoo = {new Cat("Thor", "mouse"), new Cow("Geronimo"), new Butterfly("Madama"),
        new Duck("Donald")};

    for (int i = 0; i < zoo.length; i++) {
      System.out.println("My name is " + zoo[i].getName());
      zoo[i].makeNoise();
      System.out.println(zoo[i].eat("Pizza") ? "I'm eating" : "I'm not eating");

      // verifico se l'elemento i-esimo di zoo è di tipo Cow
      if (zoo[i] instanceof Cow) {
        Cow cow = (Cow) zoo[i];
        cow.makeMilk();
      } else if (zoo[i] instanceof Cat) {
        Cat cat = (Cat) zoo[i];
        cat.play();
      }

      // verifico se sono animali volanti
      if (zoo[i] instanceof CanFly) {
        ((CanFly) zoo[i]).fly();
      }

      // verifico se sono animali nuotanti
      if (zoo[i] instanceof CanSwim) {
        ((CanSwim) zoo[i]).swim();
      }
    }

    System.out.println("***** IN THE SKY *********");
    CanFly[] flyingObjects = {new Butterfly("Madama"), new Balloon(), new Duck("Donald")};
    for (int i = 0; i < flyingObjects.length; i++) {
      flyingObjects[i].fly();
    }

  }
}
