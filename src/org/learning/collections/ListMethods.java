package org.learning.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMethods {

  public static void main(String[] args) {
    // Autoboxing
    Integer x = 10;
    int y = x;

    ArrayList<String> names = new ArrayList<>();
    names.add("Max");
    names.add("Will");
    names.add("Dustin");

    // itero con ciclo for (solo per le List che hanno indice)
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i).toUpperCase());
    }
    System.out.println("***************");

    // enhanced for
    for (String element : names) {
      System.out.println(element.toUpperCase());
    }
    System.out.println("***************");

    // iterator
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    boolean contains = names.contains("Dustin");
    System.out.println("Contains Dustin: " + contains);

    boolean removed = names.remove("Will");
    System.out.println(names);
    System.out.println(removed ? "Removed" : "Not found");

    String removedElement = names.remove(0);
    System.out.println(names);
    System.out.println(removedElement);

  }
}
