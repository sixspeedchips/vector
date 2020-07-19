package io.libsoft.physix.vector;

import java.util.Arrays;

/**
 * A 2d mutable vector class. Currently supported functions include
 * function chaining, rotation, adding vectors and scaling.
 */
public class MutableVector {

  private final double[] elements;

  public MutableVector(double x, double y) {
    elements = new double[2];
    elements[0] = x;
    elements[1] = y;
  }

  public MutableVector() {
    elements = new double[2];
    elements[0] = 0;
    elements[1] = 0;
  }

  public static MutableVector of(double x, double y) {
    return new MutableVector(x, y);
  }

  public MutableVector add(MutableVector other) {
    return add(other.elements[0], other.elements[1]);
  }

  public MutableVector add(double x, double y) {
    elements[0] += x;
    elements[1] += y;
    return this;
  }

  public MutableVector multiply(MutableVector other) {
    return multiply(other.elements[0], other.elements[1]);
  }

  public MutableVector multiply(double x, double y) {
    elements[0] *= x;
    elements[1] *= y;
    return this;
  }

  public MutableVector multiply(double scalar) {
    this.elements[0] *= scalar;
    this.elements[1] *= scalar;
    return this;
  }

  /**
   * This function returns the vector rotated about some angle in radians.
   * @param angle The rotation angle in radians.
   * @return A reference to the modified vector to allow for function chaining.
   */
  public MutableVector rotate(double angle) {
    double x = elements[0];
    double y = elements[1];
    elements[0] = Math.cos(angle * x) - Math.sin(angle * y);
    elements[1] = Math.sin(angle * x) + Math.cos(angle * y);
    return this;
  }

  public double getX() {
    return elements[0];
  }

  public double getY() {
    return elements[1];
  }

  /**
   * Returns the angle of the vector in the x,y plane on the interval
   * [0, 2*pi]
   * @return The angle in radians.
   */
  public double getAngle(){
    return (Math.atan2(elements[1], elements[0]) + Math.PI);
  }

  public double[] getElements() {
    return elements;
  }

  public MutableVector clear(){
    elements[0] = 0;
    elements[1] = 0;
    return this;
  }

  public MutableVector set(double x, double y){
    elements[0] = x;
    elements[1] = y;
    return this;
  }

  public MutableVector setX(double x){
    elements[0] = x;
    return this;
  }

  public MutableVector setY(double y){
    elements[1] = y;
    return this;
  }

  @Override
  public String toString() {
    return Arrays.toString(elements);
  }

}
