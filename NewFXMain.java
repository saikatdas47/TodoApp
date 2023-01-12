package todo;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author saikatdas
 */
public class NewFXMain extends Application implements Initializable {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NewFXMain.class.getResource("Fxml1.fxml"));
        Parent root = fxmlLoader.load();

        Fxml1Controller f1 = fxmlLoader.getController();
        f1.msg2();
        f1.msg();

        // f1.msg();
        //root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image(NewFXMain.class.getResourceAsStream("todo.png")));
        primaryStage.setTitle("Todo App");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
        // f1.displayMassage(taskname, detail, i);
        //writeNewUser();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

/* 
Saikat Das
ID: 20210104158
Section: C-2
Department: CSE
Semester: 2.1
Assignment 2: Todo App

Use Netbeans to run this project. It's built on Maven using JavaFX.
 */
