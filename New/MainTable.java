/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFxTutorial;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainTable extends Application{

    Stage window;
    TableView<TableHelper> table;
    Button addme;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Table Class");

        //Name column
        TableColumn<TableHelper, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<TableHelper, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<TableHelper, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
       

        addme = new Button("add Item");
        addme.setOnAction(e -> {
            
        });
        
        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    //Get all of the products
    public ObservableList<TableHelper> getProduct(){
        ObservableList<TableHelper> products = FXCollections.observableArrayList();
        products.add(new TableHelper("Laptop", 859.00, 20));
        products.add(new TableHelper("Bouncy Ball", 2.49, 198));
        products.add(new TableHelper("Toilet", 99.00, 74));
        products.add(new TableHelper("The Notebook DVD", 19.99, 12));
        products.add(new TableHelper("Corn", 1.49, 856));
        return products;
    }


}