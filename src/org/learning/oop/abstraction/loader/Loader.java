package org.learning.oop.abstraction.loader;

public interface Loader {

  Student[] load() throws UnableToLoadException;
}
