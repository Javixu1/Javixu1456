package vista;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import vista.MyControl;
/**
 * This controls the fxml document,we declare the methods and we put the methods in the fxml document
 * @author javierdeandres
 * @version 1.0
 * @see MainApp
 * @see MainControl2
 * @see MainControl3
 */
public class MyControl {
	 @FXML
	    private void initialize() {
	    }

	 public void showImage() {
		 try {
	            /**
	             * Load the fxml file and create a new stage for the popup
	             */
			// Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MyControl.class.getResource("MyView2.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("FormulariodeRegistro");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}

	    

	    /**
	     * Called when the user clicks ok.
	     */
	    @FXML
	    private void handledie() {
	    	showImage();
	    }

	    /**
	     * Called when the user clicks cancel.
	     */
	    @FXML
	    private void cerrar(){
	    	System.exit(0);
	    }
}
