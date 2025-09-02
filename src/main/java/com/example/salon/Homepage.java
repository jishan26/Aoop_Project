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
    private Button loginIconBtn;

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

    // Scrolls the salon cards to the left
    @FXML
    void scrollSalonLeft(ActionEvent event) {
        double current = salonScrollPane.getHvalue();
        salonScrollPane.setHvalue(Math.max(0, current - 0.2));
    }

    // Scrolls the salon cards to the right
    @FXML
    void scrollSalonRight(ActionEvent event) {
        double current = salonScrollPane.getHvalue();
        salonScrollPane.setHvalue(Math.min(1, current + 0.2));
    }

    // Scrolls the services cards to the left
    @FXML
    void scrollServicesLeft(ActionEvent event) {
        double current = servicesScrollPane.getHvalue();
        servicesScrollPane.setHvalue(Math.max(0, current - 0.2));
    }

    // Scrolls the services cards to the right
    @FXML
    void scrollServicesRight(ActionEvent event) {
        double current = servicesScrollPane.getHvalue();
        servicesScrollPane.setHvalue(Math.min(1, current + 0.2));
    }

}
