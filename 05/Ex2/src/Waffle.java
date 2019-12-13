import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * Waffle.java is a class that takes an array of expenditures and, after modifying
 * the contents appropriately, draws it into a waffle-chart. Each box in the waffle
 * chart represents one percentage, and each category is colored to show the
 * distinctive categories of the expenditures.
 *
 * @author Izhaar Dharsee IMD961
 * @version 25/11/2019
 */

public class Waffle extends Application {

    private static final int MAXIMUMITEMS = 8;

    private static final Color[] colors = new Color[]{
            Color.BLACK,
            Color.BLUE,
            Color.RED,
            Color.YELLOW,
            Color.GREEN,
            Color.MAROON,
            Color.NAVY,
            Color.CYAN
    };

    private final static int rectDimensions = 30;
    private final static int margin = 3;

    /**
     * The formatExpenditures method accepts a Expenditure array and does the following:
     * 1. Sorts the array in order of descending value.
     * 2. Curtails the expenditures to a maximum of 8 values, grouping the last elements
     * after 7 into a "Others" expenditure.
     * 3. Converts all the values of the expenditures to a percentage.
     * 4. Ensures that all the values of the expenditures add up to 100; if not, rounds
     * up the Others expenditure to make 100.
     *
     * @param expenditures A valid expenditures array passed to the method
     * @return formattedExpenditures An array with maximum 8 elements of Expenditure, their
     * values a percentage of the total.
     */
    public static Expenditure[] formatExpenditures(Expenditure[] expenditures) {
        Arrays.sort(expenditures, (Expenditure exp1, Expenditure exp2) -> exp2.getValue() - exp1.getValue());

        Expenditure[] curtailedExpenditures = new Expenditure[MAXIMUMITEMS];
        if (expenditures.length > MAXIMUMITEMS) {
            for (int i = 0; i < MAXIMUMITEMS - 1; i++) {
                curtailedExpenditures[i] = expenditures[i];
            }
            int otherTotal = 0;
            for (int i = MAXIMUMITEMS - 1; i < expenditures.length; i++) {
                otherTotal += expenditures[i].getValue();
            }
            curtailedExpenditures[MAXIMUMITEMS - 1] = new Expenditure("Other", otherTotal);
        }

        int totalValues = 0;
        for (Expenditure elem : curtailedExpenditures) {
            System.out.println("elem.getValue() = " + elem.getValue());
            totalValues += elem.getValue();
        }

        int total = 0;
        for (Expenditure elem : curtailedExpenditures) {
            elem.setValue((int) Math.round((double) elem.getValue() * 100.0 / totalValues));
            total += elem.getValue();
        }

        if (total < 100) {
            int difference = 100 - total;
            curtailedExpenditures[MAXIMUMITEMS - 1].setValue(curtailedExpenditures[MAXIMUMITEMS - 1].getValue() + difference);
        }

        return curtailedExpenditures;
    }

    /**
     * The buildWaffle method accepts an Expenditure array and a Group object and
     * draws the waffle chart based on the expenditures array in a 10x10 grid.
     * The method also colors each corresponding category appropritately and adds
     * it to the group canvas.
     *
     * @param expenditures The modified Expenditures array
     * @param root         The group root for the canvas
     */
    public static void buildWaffle(Expenditure[] expenditures, Group root) {
        int counter = 0;
        int start = 0;
        int colorCounter = 0;
        for (Expenditure elem : expenditures) {
            counter += elem.getValue();
            while (start < counter) {
                Rectangle rectangle = new Rectangle(rectDimensions, rectDimensions);
                rectangle.setX((start % 10) * (rectDimensions + margin));
                rectangle.setY((start / 10) * (rectDimensions + margin));
                rectangle.setFill(colors[colorCounter]);
                root.getChildren().add(rectangle);
                start++;
            }
            colorCounter++;
        }
    }


    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param stage the primary stage for this application, onto which
     *              the application scene can be set.
     *              Applications may create other stages, if needed, but they will not be
     *              primary stages.
     */
    @Override
    public void start(Stage stage) {

        Expenditure[] expenditures = new Expenditure[]{
                new Expenditure("Salaries", 11000),
                new Expenditure("Paper", 2000),
                new Expenditure("Rent", 5000),
                new Expenditure("Most popular books on Java etc.", 10000),
                new Expenditure("Heating", 3000),
                new Expenditure("Coffee/Tea", 7000),
                new Expenditure("Biscuits", 8000),
                new Expenditure("Travel", 18000),
                new Expenditure("Electricity", 1000),
                new Expenditure("Pencils", 3000)
        };

        Expenditure[] formattedExpenditures = formatExpenditures(expenditures);


        Group root = new Group();

        buildWaffle(formattedExpenditures, root);

        Scene scene = new Scene(root, 10 * (rectDimensions + margin), 10 * (rectDimensions + margin));

        stage.setScene(scene);
        stage.show();
    }
}
