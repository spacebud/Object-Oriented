/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxTutorial;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



//What this class does is make add buttons to both HBox and VBox. 
//We then add Hbox and Vbox into BorderPane --> Top, Left

public class MainEmbeddingLayout extends Application{
    Stage window;
    Button buttonT1, buttonT2, buttonT3;
    
    
    public static void main(String[] args){
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Embedding a Layout");
        
        
        HBox topSide = new HBox();
        buttonT1 = new Button("File");
        buttonT2 = new Button("Editor");
        buttonT3 = new Button("Settings");
        topSide.getChildren().addAll(buttonT1, buttonT2, buttonT3);
        
        
        VBox leftSide = new VBox();
        Button buttonL1 = new Button("L1");
        Button buttonL2 = new Button("L2");
        Button buttonL3 = new Button("L3");
        leftSide.getChildren().addAll(buttonL1, buttonL2, buttonL3);
        
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topSide);
        borderPane.setLeft(leftSide);
        
        Scene scene = new Scene(borderPane, 200, 200);
        window.setScene(scene);
        window.show();
        
        
    }
    
}
