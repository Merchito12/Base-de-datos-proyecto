/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PROYECTOBD extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el archivo Inicio.fxml
            Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
            
            // Configura la escena y la ventana principal
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Pantalla de Inicio");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
