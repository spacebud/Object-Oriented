/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxTutorial;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//GridPane login Page
public class MainGridPane extends Application{
    Stage window;
    Scene scene;
    Button button;
    
    

    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        
        String ussr = "sittingducks12";
        
        Stage window = new Stage();
        window = primaryStage;
        window.setTitle("Embedding a Layout");
        
        window.setOnCloseRequest(e -> { 
            e.consume();
            closeProgramss();
            });


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);
        
        Label nameLabel = new Label("Ussername");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        TextField nameInput = new TextField();
        nameInput.setPromptText("type ussername here");
        GridPane.setConstraints(nameInput, 1, 0);
        
        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel,0, 1);
        
        TextField passInput = new TextField();
        passInput.setPromptText("type pass here");
        GridPane.setConstraints(passInput, 1, 1);
        
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);
        
        Label invalidLabel = new Label(" ");
        GridPane.setConstraints(invalidLabel, 0, 2);
        
        loginButton.setOnAction(e -> {
            System.out.println("Ussername: " + nameInput.getText());
            System.out.println("Password: " + passInput.getText());
            closeProgramss();
            isInt(nameInput, passInput, passInput.getText()); 
            //Platform.exit();
                });
        
        
        
        grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passInput, loginButton, invalidLabel);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
    }
    public void closeProgramss(){
    Boolean answer = ConfirmBox.display("Close program Properly", "Are you sure you want to close??");
    if (answer){
        Platform.exit();
        }   
    }
    
    
    private Boolean isInt(TextField inputName, TextField inputAge, String message){
        try{
            int age = Integer.parseInt(inputAge.getText());
            System.out.println(inputName.getText() +" is: "+ age + " years Old");
            return true; 
        } catch (NumberFormatException e) {
            System.out.println("Error: "+ message + " is not a number");
            return false;
            }
        }
}

