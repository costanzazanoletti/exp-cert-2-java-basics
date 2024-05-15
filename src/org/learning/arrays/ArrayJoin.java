package org.learning.arrays;

import java.util.Arrays;

public class ArrayJoin {

  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {10,20,30,40};

    // creo un nuovo array di dimensione = somma delle due dimensioni
    int[] join = new int[arr1.length + arr2.length];
    System.out.println(Arrays.toString(join));

    // con 2 cicli for copio i valori del primo e del secondo nel nuovo array
    /*int i;
    for(i = 0; i < arr1.length; i++){
      join[i] = arr1[i];
    }
    System.out.println(Arrays.toString(join));

    for(int j = 0; j < arr2.length; j++){
      join[i] = arr2[j];
      i++;
    }
    System.out.println(Arrays.toString(join));*/
    int totalLength = arr1.length + arr2.length;

    for (int i = 0; i < totalLength; i++) {
      if(i < arr1.length){
        join[i] = arr1[i];
      } else {
        join[i] = arr2[i-arr1.length];
      }
    }


    System.out.println(Arrays.toString(join));
  }
}
