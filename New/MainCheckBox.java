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
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author stefanocassio
 */
public class MainCheckBox extends Application{
    
    
    Stage window;
    
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("CheckBox Example");
        
        CheckBox box1 = new CheckBox("Ham");
        CheckBox box2 = new CheckBox("Cheese");
        CheckBox box3 = new CheckBox("Tomatoes");
        //box2.setSelected(true);
        
        Button orderButton = new Button("Place Order");
        orderButton.setOnAction(e -> handleOption(box1,box2,box3));
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20,20 ,20));
        layout.getChildren().addAll(box1, box2, box3, orderButton);
        
        
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        
        window.show();
    }
    
    private void handleOption(CheckBox box1, CheckBox box2, CheckBox box3){
        
        String message = "Your Order:\n";
        if (box1.isSelected()){
            message += "Ham\n";
        }
        
        if (box2.isSelected()){
            message += "Cheese\n";
        }
        if (box3.isSelected()){
            message += "Tomatoes\n";
        }
        System.out.println(message);
    }
}
