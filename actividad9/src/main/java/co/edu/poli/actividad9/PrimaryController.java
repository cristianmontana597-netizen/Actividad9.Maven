package co.edu.poli.actividad9;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    // Esto vincula el TextArea de Scene Builder con esta variable
    @FXML
    private TextArea txtArea;

    // Este es el método que se ejecutará al presionar el botón
    @FXML
    private void limpiarCuadro() {
        txtArea.clear(); // Borra todo lo que haya escrito el usuario
        System.out.println("Se ha limpiado el cuadro de texto.");
    }
}