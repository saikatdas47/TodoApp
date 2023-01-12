/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package todo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author saikatdas
 */
public class Fxml1Controller implements Initializable {

    @FXML
    private MenuButton file;
    @FXML
    private MenuItem home;
    @FXML
    private MenuItem exit;
    @FXML
    private Button addnewtask;
    @FXML
    private Button todaystask;
    @FXML
    private Button alltask;
    @FXML
    private Button lebel1;

    @FXML
    private Button lebel2;

    @FXML
    private Button lebel3;

    @FXML
    private Button lebel4;

    @FXML
    private Button lebel5;
    @FXML
    private Button lebel6;
    private Window stage;
    @FXML
    private ImageView img;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void homeevent(ActionEvent event) throws IOException {

    }

    @FXML
    private void exitevent(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void fileevent(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml2.fxml"));
        Parent root = fxmlLoader.load();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void addnewtaskevent(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml2.fxml"));
        Parent root = fxmlLoader.load();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void todaystaskevent(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void alltaskevent(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("Fxml4.fxml"));
        Parent root = fxmlLoader.load();
        // Fxml2Controller fxml2= loader.getController() 
        
        

        Fxml4Controller f1 = fxmlLoader.getController();
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

    @FXML
    private void btn3(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
        
          Fxml3Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btn2(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
           Fxml3Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg1();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btn1(ActionEvent event) throws IOException {
        
         FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
           Fxml3Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg2();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void btn4(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
           Fxml3Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btn6(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
           Fxml3Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btn5(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml3.fxml"));
        Parent root = fxmlLoader.load();
           Fxml3Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg();
        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


}
