/**
 * Calculates the area of a circle given its radius.
 */

public class areaCircle {

  /**
   * This method calculates and returns the area of a circle
   * @param radius This is the radius of the circle for which to calculate area. Returns value as a double
   * @return A double which is the calculated area given the radius
   */
  // Method area takes in a RADIUS as a DOUBLE and returns the area of a circle as a DOUBLE with RADIUS RADIUS.
  public static double area(double radius) {
    return (Math.PI * radius * radius);
  }

  /**
   * Main method begins the program and prints out the area of a circle given its radius
   * @param args
   */
  public static void main (String[] args) {
    System.out.println(area(5));
  }
}
