package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Vladan Cupric JavaFX");

        window.setOnCloseRequest(e-> closePrograme());

        button = new Button("Close Program");
        button.setOnAction(e -> closePrograme());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private void closePrograme() {
        Boolean answer = ConfirmBox.display("Title","Are you shure");
        if(answer)
            window.close();
    }
}
