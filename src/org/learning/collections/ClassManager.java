package org.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ClassManager {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<Student> students = new HashSet<>();

    students.add(new Student(100, "Will"));
    students.add(new Student(59, "Nancy"));
    students.add(new Student(98, "Dustin"));
    students.add(new Student(5, "Max"));
    // aggiungiamo nuovamente Will
    students.add(new Student(100, "Lucas"));

    System.out.println(students);

    // me li inserisco in una lista così posso ordinarla
    List<Student> studentList = new ArrayList<>();
    studentList.addAll(students);
    System.out.println(studentList);
    // Ordino la lista
    System.out.println("Sort by name(1) or id (2)?");
    String choice = scanner.nextLine();
    switch (choice) {
      case "1":
        // by name
        Collections.sort(studentList, new StudentComparatorByName());
        break;
      case "2":
        // by id
        Collections.sort(studentList, new StudentComparatorById());
        break;
      default:
        Collections.sort(studentList);
        break;
    }
    // stampo la lista ordinata
    System.out.println(studentList);

  }
}
