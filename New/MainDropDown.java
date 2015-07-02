/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxTutorial;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainDropDown extends Application{
    
    Stage window;
    
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("DropDown Box");
        
        Button acceptButton = new Button("Click me");
        
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Arsenal", "Chelsea", "Liverpool", "Manchester City", "Manchester United");
        choiceBox.getSelectionModel().select(0);
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(acceptButton, choiceBox);
                
                
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
        acceptButton.setOnAction(e -> {
            //System.out.println(choiceBox + "  Bitchh"); If you do like this will give mem address
            
            getChoiceBox(choiceBox);
            LayoutHelper helper = new LayoutHelper(); //Here we create an object of the LayoutHelper class
            helper.nextPage();  //Here we are calling the nextPage() method from the object we just created.
                });
                
    }
    
    private void getChoiceBox(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food);
    }
    
    /*
    private void nextPage(){
        window.setTitle(("Secondary Page"));
        
        
        Button ok = new Button("OK");
        Button not = new Button("Not");
        
        HBox newLayout = new HBox();
        newLayout.setPadding(new Insets(20, 20, 20, 20));
        newLayout.getChildren().addAll(ok, not);
        
        Scene scene2 = new Scene(newLayout, 300,250);
        window.setScene(scene2);
        window.show();
        
    }
    */
    
}
