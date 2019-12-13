import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;


/**
 * Waffle.java is a class that takes an array of expenditures and, after modifying
 * the contents appropriately, draws it into a pie-chart. Each segment in the waffle
 * chart represents one category of expenditures.
 *
 * @author Izhaar Dharsee IMD961
 * @version 25/11/2019
 */

public class Pie extends Application {

    private static final int RADIUS = 150;
    private static final double TEXTOFFSET = 15.0;

    private static final int MAXIMUMITEMS = 8;

    private static int totalValues = 0;

    /**
     * The formatExpenditures method accepts a Expenditure array and does the following:
     * 1. Sorts the array in order of descending value.
     * 2. Curtails the expenditures to a maximum of 8 values, grouping the last elements
     * after 7 into a "Others" expenditure.
     * 3. Converts all the values of the expenditures to a "slice"; i.e. a degree (max 360).
     * 4. Ensures that all the values of the expenditures add up to 360; if not, rounds
     * up the Others expenditure to make 360.
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

        for (Expenditure elem : curtailedExpenditures) {
            totalValues += elem.getValue();
        }

        int total = 0;
        for (Expenditure elem : curtailedExpenditures) {
            elem.setValue((int) Math.round((double) elem.getValue() * 360.0 / totalValues));
            total += elem.getValue();
        }

        if (total < 360) {
            int difference = 360 - total;
            curtailedExpenditures[MAXIMUMITEMS - 1].setValue(curtailedExpenditures[MAXIMUMITEMS - 1].getValue() + difference);
        }

        return curtailedExpenditures;

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
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage stage) throws Exception {

        Expenditure[] expenditures = new Expenditure[]{
                new Expenditure("Salaries", 11000),
                new Expenditure("Paper", 2000),
                new Expenditure("Rent", 5000),
                new Expenditure("Most popular books on Java etc.", 10000),
                new Expenditure("Heating", 3000),
                new Expenditure("Coffee/Tea", 7000)
        };

        Expenditure[] formattedExpenditures = formatExpenditures(expenditures);

        String maxDescription = "";
        for (Expenditure elem : formattedExpenditures) {
            if (elem.getDescription().length() > maxDescription.length()) {
                maxDescription = elem.getDescription();
            }
        }

        Text canvasSizeText = new Text(maxDescription);
        double maxDescriptionWidth = canvasSizeText.getLayoutBounds().getWidth();
        double maxDescriptionHeight = canvasSizeText.getLayoutBounds().getHeight();

        double canvasWidth = 2.5 * (RADIUS + maxDescriptionWidth + TEXTOFFSET);
        double canvasHeight = 2.5 * (RADIUS + maxDescriptionHeight + TEXTOFFSET);

        double originX = canvasWidth / 2;
        double originY = canvasHeight / 2;



        Line initLine = new Line(originX, originY, originX + RADIUS, originY);

        Circle circle = new Circle(originX, originY, RADIUS, Color.WHITE);
        circle.setStroke(Color.BLACK);

        Group root = new Group();
        root.getChildren().add(circle);
        root.getChildren().add(initLine);

        int angle = 0;
        int prevAngle = 0;
        for (Expenditure elem : formattedExpenditures) {
            angle += elem.getValue();
            if (angle < 360) {
                double endX = originX + (RADIUS * Math.cos(Math.toRadians(angle)));
                double endY = originY - (RADIUS * Math.sin(Math.toRadians(angle)));

                Line line = new Line(originX, originY, endX, endY);

                root.getChildren().add(line);


            }

            int textAngle = prevAngle + ((angle - prevAngle) / 2);

            Text text = new Text(elem.getDescription());

            double textHeight = text.getLayoutBounds().getHeight();
            double textWidth = text.getLayoutBounds().getWidth();

            double textX = originX + ((RADIUS + TEXTOFFSET) * Math.cos(Math.toRadians(textAngle)));
            double textY = originY - ((RADIUS + TEXTOFFSET) * Math.sin(Math.toRadians(textAngle)));

            if (textAngle > 90 && textAngle < 270) {
                double scaledAngle = textAngle - 90;
                scaledAngle = (scaledAngle / 180.0) * 120;
                scaledAngle += 30;
                double amount = Math.sin(Math.toRadians(scaledAngle));
                System.out.println("amount = " + amount);
                textX -= textWidth * Math.sin(Math.toRadians(scaledAngle));
            }

            if (textAngle > 180) {
                textY -= textHeight * Math.sin(Math.toRadians(textAngle));
            }


            text.setX(textX);
            text.setY(textY);

            root.getChildren().add(text);


            prevAngle = angle;
        }

        Scene scene = new Scene(root, canvasWidth, canvasHeight);

        stage.setScene(scene);
        stage.show();

    }
}
