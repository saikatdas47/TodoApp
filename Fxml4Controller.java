/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package todo;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author saikatdas
 */
public class Fxml4Controller implements Initializable {

    @FXML
    private Label lebel1;
    @FXML
    private Label lebel11;
    @FXML
    private Label lebel12;
    @FXML
    private Button back;
    @FXML
    private Label lebel2;
    @FXML
    private Label lebel3;
    @FXML
    private Label lebel4;
    @FXML
    private Label lebel5;
    @FXML
    private Label lebel6;
    @FXML
    private Label lebel7;
    @FXML
    private Label lebel8;
    @FXML
    private Label lebel9;
    @FXML
    private Label lebel10;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backevent(ActionEvent event) throws IOException {
           FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("Fxml1.fxml"));
        Parent root = fxmlLoader.load();
        // Fxml2Controller fxml2= loader.getController() ;
           Fxml1Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg();
        f1.msg2();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
        void displayMassage(String taskname, String details, String i) {

        lebel3.setText("   " + " < " + i + " > " + taskname + " : " + " < " + details + " > ");

    }

    void msg() {
        Path path = Paths.get("append.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(path);
        } catch (IOException ex) {
            Logger.getLogger(Fxml1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
  

            displayMassage(line, line1, line2);
            
        }
        scanner.close();

    }
    void msg2(){
        lebel1.setText("   " + " < " + "2023-01-05" + " > " + "Assignment" + " : " + " < " + "SD Asignment" + " > ");
        lebel2.setText("   " + " < " + "2023-01-05" + " > " + "Viva" + " : " + " < " + "DLD" + " > ");

    }

    
}
