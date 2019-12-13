/**
 * The following code is buggy. Why?
 * The code below is buggy because the perimeter is manually entered for a rectangle.
 * This may be wrong, as in the case when the rectangle object is made.
 * Thereafter, the height of the rectangle is changed, and the perimeter remains unchanged, which is still the wrong perimeter for the rectagnle.
 *
 * To fix this code, the perimeter should not be passed as a variable into the constructor of the rectangle.
 * The perimeter should be calculated by the code and saved to the variable within the constructor method.
 * Once changes are made to the rectangle's height and/or width, the perimeter has to be recalculated to ensure congruency.
 * The setPerimeter method has been changed to the calculagePerimeter, which calculates the perimeter of the rectangle as necessary.
 *
 * <p>
 * We define a rectangle by the three field variables width, height,
 * and perimeter, each of type double. Furthermore, we write getters and
 * setters for the three fields as well as a toString method. We test
 * it in a main method. *
 *
 * @author Manfred Kerber
 * @version 2019-09-26
 */
public class Rectangle {
    private double width;
    private double height;
    private double perimeter;

    /**
     * <pre>
     * width
     * +--------------------------------------+
     * |                                      |
     * |                                      |
     * |                                      | height
     * |                                      |
     * |                                      |
     * +--------------------------------------+
     * </pre>
     *
     * @param width     The width of the rectangle.
     * @param height    The height of the rectangle.
     *
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calculatePerimeter();
    }

    /**
     * Getter for the width.
     *
     * @return The width of the rectangle is returned.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getter for the height.
     *
     * @return The height of the rectangle is returned.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Getter for the perimeter.
     *
     * @return The perimeter of the rectangle is returned.
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Setter for the width. The width of the rectangle is updated. * @param width The new width of the updated rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
        calculatePerimeter();
    }

    /**
     * Setter for the height. The height of the rectangle is updated.
     *
     * @param height The new height of the updated rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
        calculatePerimeter();
    }

    /**
     * Perimeter calculator. Calculates the new perimeter of the rectangle
     * and stores it in the perimeter variable.
     */
    public void calculatePerimeter() {
        this.perimeter = 2 * (this.width + this.height);
    }

    /**
     * @return A human readable description of the rectangle in form
     * of the three field variables specifying it.
     */
    public String toString() {
        return "The rectangle has a width of " + width +
                ", a height of " + height +
                ", and a perimeter of " + perimeter + ".";
    } /*
     * main method with a test of the setHeight setter and the * toString method.
     */

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        System.out.println(r);
        r.setHeight(5);
        System.out.println(r);
    }
}