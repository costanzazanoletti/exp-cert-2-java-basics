package org.learning.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExamples {

  public static void main(String[] args) {
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    System.out.println(numbers);
    boolean isAdded = numbers.add(3);
    System.out.println(isAdded ? "Added" : "Not added");
    System.out.println(numbers);
    
    System.out.println("***********");
    // itero con enhanced for
    for (Integer n : numbers) {
      System.out.println(n);
    }
    System.out.println("***********");
    // itero con iterator
    Iterator<Integer> iterator = numbers.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
