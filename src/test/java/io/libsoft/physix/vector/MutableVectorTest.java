package io.libsoft.physix.vector;

import static org.junit.jupiter.api.Assertions.*;

import io.libsoft.physix.factory.VectorFactory;
import org.junit.jupiter.api.Test;

class MutableVectorTest {


  @Test
  void add() {
    MutableVector vector = VectorFactory.mutableZeroVector();
    assertArrayEquals(new double[]{0,0}, vector.getElements());
    vector.add(1,1);
    assertArrayEquals(new double[]{1,1}, vector.getElements());
    vector.add(-1, 0);
    assertArrayEquals(new double[]{0,1}, vector.getElements());
    vector.add(10,-1);
    assertArrayEquals(new double[]{10,0}, vector.getElements());
    // testing chaining
    vector.add(-1, 1).add(-4,1);
    assertArrayEquals(new double[]{5,2}, vector.getElements());

  }

  @Test
  void testAdd() {
  }

  @Test
  void multiply() {
  }

  @Test
  void testMultiply() {
  }

  @Test
  void testMultiply1() {
  }

  @Test
  void rotate() {
  }

  @Test
  void getX() {
  }

  @Test
  void getY() {
  }

  @Test
  void getAngle() {
  }

  @Test
  void getElements() {

  }

  @Test
  void clear() {
    MutableVector vector = VectorFactory.mutableZeroVector();
    assertArrayEquals(new double[]{0,0}, vector.getElements());

  }
}