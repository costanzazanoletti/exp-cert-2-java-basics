package org.learning.oop.abstraction.loader;

public class Student {

  private final String firsName;
  private final String lastName;
  private final String classCode;

  public Student(String firsName, String lastName, String classCode) {
    this.firsName = firsName;
    this.lastName = lastName;
    this.classCode = classCode;
  }

  @Override
  public String toString() {
    return "Student{" +
        "firsName='" + firsName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", classCode='" + classCode + '\'' +
        '}';
  }
}
