package org.learning.oop.abstraction.loader;

public class LoaderFactory {

  // metodo create che genera e restituisce il Loader opportuno a seconda della configurazione
  public static Loader createLoader(String type) {
    if (type.equals("MEMORY")) {
      return new MemoryLoader();
    } else {
      return new FileLoader();
    }
  }
}
