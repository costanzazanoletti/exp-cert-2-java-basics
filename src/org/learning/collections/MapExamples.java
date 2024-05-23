package org.learning.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExamples {

  public static void main(String[] args) {
    HashMap<String, Double> grades = new HashMap<>();

    // aggiungo i dati
    grades.put("Will", 18.5);
    grades.put("Nancy", 30.0);
    grades.put("Lucas", 18.5);

    System.out.println(grades);

    grades.put("Will", 27.5);

    System.out.println(grades);

    grades.remove("Will");
    System.out.println(grades);

    System.out.println("*****************");
    // itero usando keySet
    Set<String> keys = grades.keySet();
    Iterator<String> keysIterator = keys.iterator();
    while (keysIterator.hasNext()) {
      // key
      String key = keysIterator.next();
      // value corrispondente
      Double value = grades.get(key);
      System.out.println(key + " - " + value);
    }
  }
}
