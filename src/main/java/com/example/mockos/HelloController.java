package com.example.mockos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("用来测试的代码+这是一个修改痕迹+来自hjjjjjjjjhhhhhhhhhhhhhhh");
    }
}