package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Stage primaryStage;
    public static Stage getPrimaryStage(){
        return primaryStage;
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
    	System.out.println(getClass().getResource(""));
        Parent root = FXMLLoader.load(getClass().getResource("../billList.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.setResizable(false);
        Main.primaryStage=primaryStage;
        primaryStage.show();
    }
}
