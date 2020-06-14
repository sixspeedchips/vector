package io.libsoft.physix.factory;

import io.libsoft.physix.vector.MutableVector;
import java.net.MulticastSocket;

public class VectorFactory {

  public static MutableVector mutableZeroVector(){
    return MutableVector.of(0,0);
  }


}
