/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
/**
 *
 * @author SILVIA
 */
public class JavaFXApplicationTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnRegister = new Button();
        TextField First = new TextField();
        TextField Last = new TextField();
        TextField Email = new TextField();
        TextField Contact = new TextField();
        TextField Password = new TextField();
        TextField ConfirmPassword = new TextField();
        GridPane grid=new GridPane();
        Label labelFirst = new Label   ("            First Name          ");
        
        Label labellast = new Label    ("             Last Name         ");
        Label labelEmail = new Label   ("      E-mail Address         ");
        Label labelContact = new Label ("           Contact No         ");
        Label labelPassword = new Label("              Password          ");
        Label labelConfirm = new Label ("Confirm Password          ");
        Label labelOutput = new Label("Register ");
        labelOutput.setStyle("-fx-text-fill: white; -fx-font-size: bold");
        Rectangle rect = new Rectangle(0,0,500,30);
        rect.setFill(Color.BLACK);
        
        btnRegister.setText("Register");
        btnRegister.setStyle("-fx-text-fill: white; -fx-background-color: blue;");
        btnRegister.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                labelOutput.setText("Register berhasil");
            }
        });
      
        
        Group root = new Group();
        HBox panel1 = new HBox();
        HBox panel3 = new HBox();
        HBox panel4 = new HBox();
        HBox panel5 = new HBox();
        HBox panel6 = new HBox();
        HBox panel7 = new HBox();
        
        TilePane panel2 = new TilePane();
        
        panel1.getChildren().add(labelFirst);
        panel3.getChildren().add(labellast);
        panel4.getChildren().add(labelEmail);
        panel5.getChildren().add(labelContact);
        panel6.getChildren().add(labelPassword);
        panel7.getChildren().add(labelConfirm);
        panel1.getChildren().add(First);
        panel3.getChildren().add(Last);
        panel4.getChildren().add(Email);
        panel5.getChildren().add(Contact);
        panel6.getChildren().add(Password);
        panel7.getChildren().add(ConfirmPassword);
        
        panel2.getChildren().addAll(btnRegister);
        
        panel1.setLayoutX(55);
        panel1.setLayoutY(40);
        
        panel3.setLayoutX(55);
        panel3.setLayoutY(80);
        
        panel4.setLayoutX(55);
        panel4.setLayoutY(120);
        
        panel5.setLayoutX(55);
        panel5.setLayoutY(160);
        
        panel6.setLayoutX(55);
        panel6.setLayoutY(200);
        
        panel7.setLayoutX(55);
        panel7.setLayoutY(240);
        
        panel2.setLayoutX(200);
        panel2.setLayoutY(270);
        
        labelOutput.setLayoutX(10);
        labelOutput.setLayoutY(5);
        
        root.getChildren().addAll(rect,panel1,panel2, panel3, panel4, panel5, panel6, panel7,labelOutput);
        
        Scene scene = new Scene(root, 500, 300);
        scene.setFill(Color.WHITE);
        primaryStage.setTitle("Test JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
