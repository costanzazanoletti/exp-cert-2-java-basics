package org.learning.oop.geometry;

public class Main {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(-10, 30);
    //Rectangle rectangle2 = new Rectangle(55, 18);

    // rectangle.height = -10;
    rectangle.setBase(-10);

    int area = rectangle.getArea();
    int perimeter = rectangle.getPerimeter();

    //System.out.println(rectangle2);
    System.out.println(rectangle);
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);


  }
}
