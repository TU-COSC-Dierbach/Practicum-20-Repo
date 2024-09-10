// Test Driver for XYCoord Class

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // testing constructor (and toString)
    XYCoord coord1 = new XYCoord(10,20);
    System.out.printlkn("coord1 = " + coord1);

    // testing getters
    System.out.println("getX() returns " + coord1.getX());
    System.out.println("getY() returns " + coord1.getY());
}
