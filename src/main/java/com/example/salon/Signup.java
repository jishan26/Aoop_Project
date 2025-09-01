package com.example.salon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class Signup {
    public Main main;

    public void setMain(Main main) {
        this.main = main;
    }
    @FXML
    private ToggleGroup accountTypeGroup;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField phoneField;

    @FXML
    private AnchorPane root;

    @FXML
    private RadioButton shopOwnerTypeRadio;

    @FXML
    private Hyperlink signInLink;

    @FXML
    private Button signUpButton;

    @FXML
    private CheckBox termsCheck;

    @FXML
    private Hyperlink termsLink;

    @FXML
    private RadioButton userTypeRadio;

    @FXML
    void handleSignIn(ActionEvent event) {

    }

    @FXML
    void handleSignUp(ActionEvent event) {

    }

    @FXML
    void handleTermsAndConditions(ActionEvent event) {

    }

}
