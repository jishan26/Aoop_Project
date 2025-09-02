package com.example.salon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {
    public Main main;

    public void setMain(Main main) {
        this.main = main;
    }
    @FXML
    private Hyperlink createAccountLink;

    @FXML
    private TextField emailField;

    @FXML
    private Hyperlink forgotPasswordLink;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox rememberMeCheck;

    @FXML
    void handleCreateAccount(ActionEvent event) throws IOException {
            main.signup();
    }

    @FXML
    void handleForgotPassword(ActionEvent event) {

    }

    @FXML
    void handleLogin(ActionEvent event) throws IOException {
        main.login();
    }


}
