/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package todo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author saikatdas
 */
public class Fxml3Controller implements Initializable {

    @FXML
    private Button delete;
    @FXML
    private Button back;
    @FXML
    private TextArea showtask;
    @FXML
    private TextArea showdetails;
    @FXML
    private TextArea showdate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backevent(ActionEvent event) throws IOException {
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

    void displayMassage(String taskname, String details, String i) {

        showtask.setText("   " + taskname + "  " + "  ");
        showdetails.setText("   " + details + "  " + "  ");
        showdate.setText("   " + i + "  " + "  ");

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

    void msg2() {
        showtask.setText("   " + "Assignment" + "  " + "  ");
        showdetails.setText("   " + "SD Asignment" + "  " + "  ");
        showdate.setText("   " + "2023-01-05" + "  " + "  ");

    }

    void msg1() {
        showtask.setText("   " + "Viva" + "  " + "  ");
        showdetails.setText("   " + "DLD" + "  " + "  ");
        showdate.setText("   " + "2023-01-05" + "  " + "  ");

    }

    @FXML
    private void deleteevent(ActionEvent event) {
        try{
    FileWriter fw = new FileWriter("append.txt", false);
    PrintWriter pw = new PrintWriter(fw, false);
    pw.flush();
        pw.flush();

            pw.flush();

    pw.close();
    fw.close();
    }catch(Exception exception){
        System.out.println("Exception have been caught");
    }
    }
}
