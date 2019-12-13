import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * Upload.java is a class that draws an upload image on the screen. It makes use
 * of polygons to construct the diagram.
 *
 * @author Izhaar Dharsee IMD961
 * @version 25/11/2019
 */

public class Upload extends Application {

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
        Group root = new Group();
        Scene scene = new Scene(root, 373, 332);

        double offset = 50.0;
        Polygon polygon1 = new Polygon();
        polygon1.getPoints().addAll(new Double[]{
                offset + 0.0, offset + 77.0,
                offset + 40.0, offset + 77.0,
                offset + 40.0, offset + 192.0,
                offset + 233.0, offset + 192.0,
                offset + 233.0, offset + 77.0,
                offset + 273.0, offset + 77.0,
                offset + 273.0, offset + 232.0,
                offset + 0.0, offset + 232.0
        });

        Polygon polygon2 = new Polygon(
                offset + 135.0, offset + 0.0,
                offset + 78.0, offset + 38.0,
                offset + 115.0, offset + 38.0,
                offset + 115.0, offset + 155.0,
                offset + 155.0, offset + 155.0,
                offset + 155.0, offset + 38.0,
                offset + 192.0, offset + 38.0,
                offset + 135.0, offset + 0.0
        );


        root.getChildren().addAll(polygon1, polygon2);
        stage.setScene(scene);
        stage.show();

    }
}
