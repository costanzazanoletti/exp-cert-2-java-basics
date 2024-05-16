package org.learning.random;

import java.util.Random;

public class RandomNumbers {

  public static void main(String[] args) {
    Random randomGenerator = new Random();
    int randomNum = randomGenerator.nextInt(100, 200);

    System.out.println(randomNum);


    int randomMath = (int)(Math.random() * 10);

    double d = 10;
  }
}
