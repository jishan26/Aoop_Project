package com.example.salon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;

public class Homepage {
    public Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private HBox salonCardsContainer;

    @FXML
    private Button salonLeftBtn;

    @FXML
    private Button salonRightBtn;

    @FXML
    private ScrollPane salonScrollPane;

    @FXML
    private HBox servicesCardsContainer;

    @FXML
    private Button servicesLeftBtn;

    @FXML
    private Button servicesRightBtn;

    @FXML
    private ScrollPane servicesScrollPane;

    @FXML
    void scrollSalonLeft(ActionEvent event) {

    }

    @FXML
    void scrollSalonRight(ActionEvent event) {

    }

    @FXML
    void scrollServicesLeft(ActionEvent event) {

    }

    @FXML
    void scrollServicesRight(ActionEvent event) {

    }

}
