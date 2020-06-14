package io.libsoft.physix;

import io.libsoft.physix.vector.MutableVector;

public class Main {


  public static void main(String[] args) {

    MutableVector vector = MutableVector.of(0,0);
    System.out.println(vector);
    vector.add(10,10);
    System.out.println(vector);
    vector.add(-10, -10).multiply(3).add(4,4);
    System.out.println(vector);


  }


}
