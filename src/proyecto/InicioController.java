/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * FXML Controller class
 *
 * @author brand
 */
public class InicioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
  
public Connection connectToDatabase(String ip, String port, String user, String password) {
    String url = "jdbc:mysql://" + ip + ":" + port + "/your_database"; // Reemplaza 'your_database' por el nombre de tu base de datos
    Connection connection = null;

    try {
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Conexión exitosa a la base de datos");
    } catch (SQLException e) {
        System.err.println("Error al conectar: " + e.getMessage());
    }

    return connection;
}

    
}

