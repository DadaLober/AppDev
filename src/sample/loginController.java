package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginController {

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    public void loginButtonOnAction (ActionEvent e) {

        if (usernameTextField.getText().isBlank() == false && passwordPasswordField.getText().isBlank() == false){
            //loginMessageLabel.setText("Login Failed!");
            ValidateLogin();
        } else {
            loginMessageLabel.setText("Please enter Username and Password!");
        }
    }

    public void cancelButtonOnAction (ActionEvent e) throws IOException {
        Main.switchScene("landing");
    }

    public void ValidateLogin() {
            DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM useraccounts WHERE username = '" + usernameTextField.getText()+ "' AND password = '" + passwordPasswordField.getText()+ "'";
        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    //loginMessageLabel.setText("Welcome");
                    Main.switchScene("dashboard");
                }else {
                    loginMessageLabel.setText("Login Failed!");
                }
            }
        }catch (Exception e){
               e.printStackTrace();
        }
    }
}
