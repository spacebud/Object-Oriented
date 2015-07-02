

package JavaFxTutorial;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class MainCloseProperly extends Application{
    
    public static void main(String[] args){
        launch(args);
    }
    Stage window;
    Button button; 
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Close Properly");
        
        window.setOnCloseRequest(e -> {
            e.consume(); //The user sent a request to close but consume() is telling that 
                         //Consumes this event so that it will not be processed in the default manner by the source which originated it.
            closeProgramss();
                });
        
        button = new Button("Close Program");
        button.setOnAction(e -> closeProgramss());
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 300);
        
        window.setScene(scene);
        window.show();
        
    }
    
    public void closeProgramss(){
        Boolean answer = ConfirmBox.display("Close program Properly", "Are you sure you want to close??");
        if (answer){
            Platform.exit();
        }   
    }
}
