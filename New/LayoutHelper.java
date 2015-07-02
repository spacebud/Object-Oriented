/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxTutorial;

import static java.awt.SystemColor.window;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author stefanocassio
 */
public class LayoutHelper {
    
       public static void nextPage(){
        Stage window = new Stage();
        
        window.setTitle(("Secondary Page"));
        
        
        Button ok = new Button("OK");
        Button not = new Button("Not");
        
        HBox newLayout = new HBox();
        newLayout.setPadding(new Insets(20, 20, 20, 20));
        newLayout.getChildren().addAll(ok, not);
        
        
        //EmptyLayout newLayout2 = new EmptyLayout();
        MainDropDown startPage = new MainDropDown();
        MainGridPane gridPanePage = new MainGridPane();
        
        
        ok.setOnAction((e -> {
            gridPanePage.start(window);
            
        }));
        
        not.setOnAction(e -> {
            startPage.start(window);
        });
        
        Scene scene2 = new Scene(newLayout, 300,250);
        window.setScene(scene2);
        window.show();
    }
       
       
    
}
