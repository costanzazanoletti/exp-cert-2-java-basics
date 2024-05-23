package org.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class ClassManager {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student(100, "Will"));
    students.add(new Student(59, "Nancy"));
    students.add(new Student(98, "Dustin"));
    students.add(new Student(5, "Max"));

    System.out.println(students);

    boolean contains = students.contains(new Student(100, "Will"));
    System.out.println(contains ? "Will is present" : "Will not found");
  }
}
