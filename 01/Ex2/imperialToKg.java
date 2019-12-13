/**
 * Converts weights in imperial to kg
 */

public class imperialToKg {

  /**
   * The main method begins the program and prints out the result by calling the convert method
   * @param args
   */
  public static void main (String[] args) {
    System.out.println(convert(0.0, 0.0, 0.0, 11.0, 6.0, 0.0, 0.0, 0.0));
  }

  /**
   * The convert method converts an imperial weight to its equivalent in kg
   * @param ton Weight in tons
   * @param hundredweight Weight in hundredweight
   * @param quarter Weight in quarter
   * @param stone Weight in stone
   * @param pound Weight in pound
   * @param ounce Weight in ounce
   * @param drachm Weight in drachm
   * @param grain Weight in grain
   * @return Total weight in kg
   */
  public static String convert(double ton, double hundredweight, double quarter, double stone, double pound, double ounce, double drachm, double grain) {
    double totalPounds = (ton*2240) + (hundredweight*112) + (quarter*28) + (stone*14) + pound + (ounce/16) + (drachm/256) + (grain/7000);
    return (totalPounds * 0.45359237 + " kg");
  }
}
