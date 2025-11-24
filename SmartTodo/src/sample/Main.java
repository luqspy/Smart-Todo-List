package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/todo.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Smart Todo List");

        // ADD LOGO HERE
        stage.getIcons().add(new Image(
                getClass().getResource("/sample/logo.png").toExternalForm()
        ));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
