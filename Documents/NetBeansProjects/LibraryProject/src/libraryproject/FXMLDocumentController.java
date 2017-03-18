/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author study
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField userTxt;
    @FXML
    private TextField passTxt;
    @FXML
    private Button loginBtn;
    @FXML
    private Hyperlink signUpLnk;
    @FXML
    private Hyperlink forgotLink;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logIn(ActionEvent event) throws IOException {
        Stage prev = (Stage) loginBtn.getScene().getWindow();
        prev.close();
       try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoanBooks.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          };
    }

    @FXML
    private void signUp(ActionEvent event) {
         Stage prev = (Stage) loginBtn.getScene().getWindow();
        prev.close();
       try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignupPage.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          };
        
    }

    @FXML
    private void rememberPassword(ActionEvent event) {
         Stage prev = (Stage) loginBtn.getScene().getWindow();
        prev.close();
       try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ForgotPassword.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          };
        
    }
    
}
