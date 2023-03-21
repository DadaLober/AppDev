package sample;

import javafx.event.ActionEvent;
import java.io.IOException;

public class landingController {

    public void landingRegisterOnAction(ActionEvent event) throws IOException {
        Main.switchScene("register");
    }

    public void landingLoginOnAction(ActionEvent event) throws IOException {
        Main.switchScene("login");;
    }
}
