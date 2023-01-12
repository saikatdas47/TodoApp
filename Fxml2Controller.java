/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package todo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.css.converter.StringConverter;

/**
 * FXML Controller class
 *
 * @author saikatdas
 */
public class Fxml2Controller implements Initializable {

    @FXML
    private TextField task;
    @FXML
    private TextField details;
    @FXML
    private DatePicker deadline;
    @FXML
    private Button home;
    @FXML
    private Button save;
    @FXML
    private Label msg;

    private String taskname;
    private String detail;
    private LocalDate i;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void exitevent(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    private void taskevent(ActionEvent event) {

    }

    @FXML
    private void saveevent(ActionEvent event) throws IOException {

        taskname = task.getText();
        detail = details.getText();

        if (taskname != null) {
            msg.setText("Added task Sucsessfully!");

        } else {
            msg.setText("Please add your task!");

        }

        writeNewUser();

    }

    public void writeNewUser() {
        // PrintWriter fw = null;

        LocalDate date = deadline.getValue();

        try {
            File file = new File("append.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pr = new PrintWriter(br);
            pr.println(task.getText());
            pr.println(details.getText());
            pr.println(deadline.getValue());
            pr.close();
            br.close();
            fr.close();

        } catch (IOException e) {

        }
    }

    @FXML
    private void homeevent(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("fxml1.fxml"));
        Parent root = fxmlLoader.load();

        Fxml1Controller f1 = fxmlLoader.getController();
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();
        f1.msg();
        f1.msg2();

        // Fxml2Controller fxml2= loader.getController() ;
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
