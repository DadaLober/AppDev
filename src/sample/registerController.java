package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class registerController {


    @FXML
    private Button registerButton;
    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField registerUsernameTextField;
    @FXML
    private PasswordField registerPasswordPasswordField;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;

    public void registerCancelOnAction(ActionEvent event) throws IOException {
        Main.switchScene("landing");
    }
    public void registerRegisterOnAction(ActionEvent event) throws IOException {
        boolean invalidInput;
        invalidInput = false;

        if (firstnameTextField.getText().isBlank()){
            invalidInput = true;
        }
        if (lastnameTextField.getText().isBlank()){
            invalidInput = true;
        }
        if (registerUsernameTextField.getText().isBlank()){
            invalidInput = true;
        }
        if (registerPasswordPasswordField.getText().isBlank()){
            invalidInput = true;
        }
        if (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected());

    }
}
