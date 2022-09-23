/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangogarden;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private TextField pf;
    @FXML
    private Label lblMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonOwnerLoginOnClick(ActionEvent event) throws IOException {
                String user = "Tuhin";
	String pw = "abcd";
	String checkUser, checkPw;
        
        checkUser = txtUserName.getText();
        checkPw = pf.getText();
        if(checkUser.equals(user) && checkPw.equals(pw)){
                            
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("gardenowner.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        			
        		}
        		else{
        			lblMessage.setText("Incorrect user or pw.");
        			
        		}
        		txtUserName.setText("");
        		pf.setText("");
    }


    

    @FXML
    private void buttonWorkerLoginOnClick(ActionEvent event) throws IOException {
                        String user1  = "Worker";
	String pw1  = "abcde";
	String checkUser, checkPw;
        
        checkUser = txtUserName.getText();
        checkPw = pf.getText();
        if(checkUser.equals(user1) && checkPw.equals(pw1)){
                            
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Worker.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        			
        		}
        		else{
        			lblMessage.setText("Incorrect user or pw.");
        			
        		}
        		txtUserName.setText("");
        		pf.setText("");
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("Worker.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        
        
    }
}
    

