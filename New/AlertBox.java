/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxTutorial;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//This class creates a page pop-up where you cant do anything else until you 
//have resolved the errors on that pop-up page. 

public class AlertBox {
    
    // We can use static here as we dont have any object 
    public static void display(String title, String message){
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);//This tells us that application should open in current window.
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label label = new Label();
        label.setText(message);
        
        Button button = new Button("Close Button");
        button.setOnAction(e -> window.close());
        
        VBox layout = new VBox();
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //This makes it so that you cant go to the initial page
                              //until uve cleared the error.
       
    }
    
}
