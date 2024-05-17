package org.learning.oop.geometry;

public class Rectangle {

  // ATTRIBUTI
  private int base;
  private int height;

  // COSTRUTTORI
  public Rectangle(int height, int base) {
    // controllo che base e height siano > 0 altrimenti gli do default 1
    this.height = valueOrDefault(height);
    this.base = valueOrDefault(base);
  }

  // METODI
  // metodo getArea calcola l'area del rettangolo a partire dalle sue dimensioni
  public int getArea() {
    return base * height;
  }

  // metodo getPerimeter calcola il perimetro del rettangolo a partire dalle sue dimensioni
  public int getPerimeter() {
    return 2 * base + 2 * height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "base=" + base +
        ", height=" + height +
        '}';
  }

  // metodo di servizio per restituire il default se il valore è <= 0
  private int valueOrDefault(int value) {
    return value > 0 ? value : 1;
  }

  // GETTER E SETTER
  public int getBase() {
    return base;
  }

  public int getHeight() {
    return height;
  }

  // nei setter faccio gli stessi controlli che nel costruttore o in altri metodi dove do valore
  // agli attributi private
  public void setBase(int base) {
    this.base = valueOrDefault(base);
  }

  public void setHeight(int height) {
    this.height = valueOrDefault(height);
  }
}
