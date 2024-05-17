package org.learning.oop.cars;

public class Main {

  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car("Tesla", "S1", "Red", 2020);
    Car c3 = new Car();

    System.out.println("Brand: " + c1.brand);
    System.out.println("Model: " + c1.model);
    System.out.println("Color: " + c1.color);
    System.out.println("Year: " + c1.year);

    c1.year = 2024;
    c1.brand = "Toyota";
    c1.model = "Prius";
    c1.color = "Black";

    System.out.println("*******************");
    System.out.println("Brand: " + c1.brand);
    System.out.println("Model: " + c1.model);
    System.out.println("Color: " + c1.color);
    System.out.println("Year: " + c1.year);
    System.out.println("*******************");
    System.out.println("Brand: " + c2.brand);
    System.out.println("Model: " + c2.model);
    System.out.println("Color: " + c2.color);
    System.out.println("Year: " + c2.year);

    c2.changeColor("Red");
    String newColor = "Yellow";
    c2.changeColor(newColor);
    c2.changeBrandModel("Audi", "Q3");
    System.out.println(c2.brand);
    System.out.println(c2.model);
    c2.year = 2019;

    int c2Age = c2.getAge();

    if (c2Age > 0) {
      System.out.println("Age: " + c2Age);
    } else {
      System.out.println("Unable to compute age");
    }

    c1.changeColor(255);


  }
}
