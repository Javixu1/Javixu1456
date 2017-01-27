package clase;

import java.io.IOException;

import clase.MyMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A example of the use of javafx and scene builder with eclipse
 * @author javierdeandres
 * @version 1.0
 * @see MainControl
 * @see MainControl2
 * @see MainControl3
 */
public class MyMain extends Application{
	private Stage primaryStage;
	private AnchorPane rootLayout;
	@Override
	public void start(Stage primaryStage) throws Exception {
		/**
		 * This executes all the application
		 */
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("My GitHub Profile");
		this.primaryStage.setX(600);
		this.primaryStage.setY(400);
		
		this.primaryStage = primaryStage;
		primaryStage.show();
		initRootLayout();
		
	}
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyMain.class.getResource("../vista/MyView1.fxml"));
			rootLayout = (AnchorPane) loader.load();
			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	}


