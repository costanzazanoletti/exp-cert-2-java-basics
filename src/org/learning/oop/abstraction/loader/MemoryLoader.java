package org.learning.oop.abstraction.loader;

public class MemoryLoader implements Loader {

  @Override
  public Student[] load() {
    Student[] students = {
        new Student("Marco", "Granata", "cert2"),
        new Student("Gianmaria", "Carelli", "cert2"),
        new Student("Marco", "Percolla", "cert2"),
    };
    return students;
  }
}
