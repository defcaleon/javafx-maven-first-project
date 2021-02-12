package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button mainButton;

    public void buttonClicked() {
        System.out.println("Button clicked!");
        mainButton.setText("fuck me");
    }
}