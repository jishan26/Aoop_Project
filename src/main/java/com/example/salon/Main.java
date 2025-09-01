package com.example.salon;
import com.example.salon.Homepage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
            this.primaryStage = primaryStage;
              this.homepage();

    }

    public void homepage() throws IOException {
      FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Homepage.fxml"));
        Parent root = loader.load();

        Homepage homepage = loader.getController();
        homepage.setMain(this);

        this.primaryStage.setTitle("HomePage");
        this.primaryStage.setScene(new Scene(root, 814, 600)); // smaller default
        this.primaryStage.show();
    }

    public void login() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loader.load();

         Login login= loader.getController();
         login.setMain(this);

        this.primaryStage.setTitle("Login");
        this.primaryStage.setScene(new Scene(root, 900, 600)); // smaller default
        this.primaryStage.show();
    }
    public void signup() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Signup.fxml"));
        Parent root = loader.load();

        Signup signup = loader.getController();
        signup.setMain(this);

        this.primaryStage.setTitle("Signup");
        this.primaryStage.setScene(new Scene(root, 914, 600)); // smaller default
        this.primaryStage.show();
    }

}
