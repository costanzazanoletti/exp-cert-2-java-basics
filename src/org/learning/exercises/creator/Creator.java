package org.learning.exercises.creator;

public class Creator {
  // metodo che ritorna una istanza di dvd player o playstation in base al parametro passato in ingresso

  public static Device create(DeviceType type) throws IllegalArgumentException {
    if (type.equals(DeviceType.DVD_PLAYER)) {
      return new DvdPlayer();
    } else if (type.equals(DeviceType.PLAYSTATION)) {
      return new Playstation();
    } else if (type.equals(DeviceType.RADIO)) {
      return new Radio();
    } else {
      throw new IllegalArgumentException("Invalid type");
    }
  }
}
