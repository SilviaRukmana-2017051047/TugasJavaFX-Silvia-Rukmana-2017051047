//Nama: Silvia Rukmana
//NPM: 2017051047
//Kelas: D
package tugasjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author silvia rukmanaD
 */
public class TugasJavaFX extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
      window=primaryStage;
      window.setTitle("Register");      
      GridPane grid=new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setVgap(15);
      grid.setHgap(15);
      grid.setPadding(new Insets(15));
      
      Text welcomeTxt= new Text("Register");
      welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 15));
      grid.add(welcomeTxt, 0, 0);
      welcomeTxt.setFill( Color.BLACK);
      
      Label lblFirstname =new Label("First Name");
      grid.add(lblFirstname, 1, 1);
      
      TextField txtFirstname=new TextField();
      txtFirstname.setPromptText ("");
      grid.add(txtFirstname, 2,1);
      
      Label lblLastname =new Label("Last Name");
      grid.add(lblLastname, 1, 2);
      
      PasswordField pwBox=new PasswordField();
      pwBox.setPromptText ("");
      grid.add(pwBox, 2,2);
      
      Label lblEmail =new Label("E-mail Address");
      grid.add(lblEmail, 1, 3);
      
      TextField txtEmail=new TextField();
      txtEmail.setPromptText ("");
      grid.add(txtEmail, 2,3);
      
      Label lblContact =new Label("Contact No");
      grid.add(lblContact, 1,4);
      
      TextField txtContact=new TextField();
      txtContact.setPromptText ("");
      grid.add(txtContact, 2,4);
      
      Label lblPassword =new Label("Password");
      grid.add(lblPassword, 1, 5);
      
      TextField txtPassword=new TextField();
      txtPassword.setPromptText ("");
      grid.add(txtPassword, 2,5);
      
      Label lblConfirm =new Label("Confirm Password");
      grid.add(lblConfirm, 1, 6);
      
      TextField txtConfirm=new TextField();
      txtConfirm.setPromptText ("");
      grid.add(txtConfirm, 2,6);
      
      Button RegisterBtn=new Button("Register");
      RegisterBtn.setStyle("-fx-background-color: blue;-fx-text-fill: white");
      grid.add(RegisterBtn, 2 , 7);
      RegisterBtn.setOnAction(e->{
          System.out.println("Register button pressed");
      });
      
      Scene scene=new Scene(grid, 400,400);
      window.setScene(scene);
      window.show();
    }

    
    
}
