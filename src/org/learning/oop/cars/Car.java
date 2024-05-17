package org.learning.oop.cars;

import java.time.LocalDate;

public class Car {

  // ATTRIBUTI
  String brand;
  String model;
  String color;
  int year;

  // COSTRUTTORI
  Car() { // firma Car, []
    // inizializzo year con l'anno corrente
    year = LocalDate.now().getYear();
  }

  Car(String brand, String model, String color, int year) { // Car, [String, String, String, int]
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

  // METODI
  void changeColor(String newColor) { // signature: changeColor, [String]
    color = newColor;
  }

  void changeColor(int newColor) { // signature: changeColor, [int]
    color = "#" + newColor;
  }

  void changeBrandModel(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  int getAge() {
    if (year != 0) {
      LocalDate today = LocalDate.now();
      int age = today.getYear() - year;
      return age;
    }
    return -1;
  }
}
