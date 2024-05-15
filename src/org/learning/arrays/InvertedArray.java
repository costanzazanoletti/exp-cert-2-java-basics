package org.learning.arrays;

public class InvertedArray {

  public static void main(String[] args) {
    double[] numbers = {0.0, 0.1, 0.2, 0.3};

    // stampo a video i valori dell'array dall'ultimo al primo


    for(int i = numbers.length -1; i >= 0; i--){
      if(i == 1) {
        break;
      }
      System.out.println(numbers[i]);
    }

    System.out.println("End");
  }
}
