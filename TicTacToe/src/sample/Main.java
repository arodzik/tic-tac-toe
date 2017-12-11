package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
            try{
                VBox root = (VBox) FXMLLoader.load(getClass().getResource("sample.fxml"));
                Scene scene = new Scene(root);
                //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                primaryStage.setTitle("Tic-Tac-Toe");
                primaryStage.setScene(scene);
                primaryStage.show();
            }
            catch (Exception e){
                e.printStackTrace();
            }


    }


    public static void main(String[] args) {

        launch(args);
    }
}
