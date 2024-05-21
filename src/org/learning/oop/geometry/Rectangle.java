package org.learning.oop.geometry;

public class Rectangle {

  // ATTRIBUTI
  private int base;
  private int height;

  // COSTRUTTORI
  public Rectangle(int height, int base) throws IllegalArgumentException {
    // controllo che base e height siano > 0 altrimenti sollevo un'eccezione
    checkValue(base, "base");
    checkValue(height, "height");
    this.height = valueOrDefault(height);
    this.base = valueOrDefault(base);
  }

  public Rectangle(String heightString, String baseString) throws IllegalArgumentException {
    int baseValue = 0;
    int heightValue = 0;

    try {
      baseValue = Integer.parseInt(baseString);
      heightValue = Integer.parseInt(heightString);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("base and height mmust be > 0");
    }
    checkValue(baseValue, "base");
    checkValue(heightValue, "height");
    this.base = baseValue;
    this.height = heightValue;
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
  public void setBase(int base) throws IllegalArgumentException {
    checkValue(base, "base");
    this.base = base;
  }

  public void setHeight(int height) throws IllegalArgumentException {
    checkValue(height, "height");
    this.height = height;
  }

  private void checkValue(int value, String type) throws IllegalArgumentException {
    if (value <= 0) {
      throw new IllegalArgumentException("Invalid " + type);
    }
  }

  public int fake() {
    try {
      if (base > height) {
        return base + height;
      }
      throw new IllegalArgumentException("FAKE EXCEPTION");
    } catch (IllegalArgumentException e) {
      throw e;
    } finally {
      System.out.println("FINALLY");
    }
  }

}
