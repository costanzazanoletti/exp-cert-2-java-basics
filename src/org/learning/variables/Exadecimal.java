package org.learning.variables;

public class Exadecimal {

  public static void main(String[] args) {
    int valoreEsadecimale = 0XFF0000;
    System.out.println("Il valore in decimale è: " + valoreEsadecimale);
    int rosso = (valoreEsadecimale >> 16) & 0xFF;
    int verde = (valoreEsadecimale >> 8) & 0xFF;
    int blu = valoreEsadecimale & 0xFF;

    System.out.println("Rosso: " + rosso);
    System.out.println("Verde: " + verde);
    System.out.println("Blu: " + blu);

  }
}
