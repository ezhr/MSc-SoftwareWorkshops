/**
 * The TimeToAngle program calculates the angle between the hour and minute hands on a clock
 */
public class timeToAngle {

  /**
   * The main method starts the program and prints out the angle between the hour and minute hands returned from the calculateAngle method
   */
  public static void main (String args[]) {
    System.out.println(calculateAngle(13, 05, 27.272727272727));
  }

  /**
   * The calculateAngle method calculates the angles between the hour and minute hands on a clock
   * @param hour The time in hours
   * @param minute The time in minutes
   * @return An int signifying the angle between the hour and minute hands
   */

  public static int calculateAngle(int hour, int minute, double second) {
    // Converts hours into 12-hour and calculates its angle from 0
    int angleHour = (int) (((hour % 12) / 12.0) * 360.0);
    
    // Calculates minute hand angle from 0
    int angleMinute = (int) ((minute / 60.0) * 360.0);

    // Adds angle difference to hour hand for minute movement
    angleHour += (360 / 12.0) * (minute / 60.0);

    // Adds angle difference to minute hand for second movement
    angleMinute += (360 / 60.0) * (second / 60.0);

    // Calculates and returns correct angle of minute hand from hour hand
    if (angleHour > angleMinute) {
      return 360 % (angleHour - angleMinute);
    } else {
      return 360 % (360 - (angleMinute - angleHour));
    }
  }
}
