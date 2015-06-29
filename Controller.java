package javafx_101;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;



public class Controller {

    
    @FXML private Text actionTarget;
    
    @FXML private Text home_page;
    
    //we need to declare the variable for the close button
    @FXML private javafx.scene.control.Button login_button_submit;
   
    
    
    @FXML protected void login_button_cancel(ActionEvent event) {
        System.out.println("Your ussername/password is incorrect, please try again");
        actionTarget.setText("Incorrect ussername/password!");
    }
    
    @FXML protected void login_button_submit(ActionEvent event){
        System.out.println("WELCOME, STEFANO");
        Stage stage = (Stage)login_button_submit.getScene().getWindow();
        stage.close();
    }
    
    @FXML protected void login_button_register(ActionEvent event){
        System.out.println("Do you really want to ???");
    }
    
    
    
    
    
}
