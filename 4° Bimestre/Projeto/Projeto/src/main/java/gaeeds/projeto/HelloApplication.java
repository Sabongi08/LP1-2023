package gaeeds.projeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("CriaContaController.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load());
        stage.setTitle("Cadastro");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}