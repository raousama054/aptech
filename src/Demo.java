import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Demo extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me");
        button.setOnMouseClicked(event -> System.out.println("Clicked"));

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
