package control;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import view.ExamController;



/**
 * 
 * @author Miguelitoxx1986
 *
 */

public class MyGithubProfile extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	

	public MyGithubProfile() {
		
	}

	public static void main(String[] args) {
		launch(args);

	}
	
	/**
	 * 
	 * 
	 * primaryStage se le tiene que pasar una ventana
	 * 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;

		this.primaryStage.setTitle("My Github ");
		//this.primaryStage.getIcons().add(new Image("file:resources/images/AddressApp.png"));

		initRootLayout();
		primaryStage.setMaximized(false);
		
	}
	
	//Cargamos la clase con el objetoFXMLOADER
	
	public void initRootLayout() throws InvocationTargetException {
		try {
			// Cargo mi layout para el fichero xml
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyGithubProfile.class.getResource("../view/Ventana1.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Mostramos en el init root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setScene(scene);
			
			
			// Cargo el controlador en mi Clase principal
			ExamController controller = loader.getController();
			controller.setMygithubprofile(this);
						
			primaryStage.show();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showProfileDetails() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MyGithubProfile.class.getResource("../view/Detalles.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Edit Form");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			dialogStage.setResizable(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			dialogStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
