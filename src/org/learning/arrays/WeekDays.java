package org.learning.arrays;

import java.util.Arrays;

public class WeekDays {

  public static void main(String[] args) {
    String[] weekDays = new String[7];

    System.out.println(weekDays.length);

    // weekDays.length = 5; // non lo possiamo fare

    System.out.println(Arrays.toString(weekDays));

    weekDays[0] = "Mon";
    weekDays[1] = "Tue";
    weekDays[2] = "Wen";

    System.out.println(Arrays.toString(weekDays));

    int[] numbers = new int[15];
    System.out.println(Arrays.toString(numbers));

    System.out.println(numbers[1] + 5);

    boolean[] flags = {true, false, false};
    for (int i = 0; i < flags.length; i++) {
      System.out.println(flags[i]);
    }


  }
}
