package view;


import control.MyGithubProfile;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ExamController {
	
		MyGithubProfile mygithubprofile;
		private Stage dialogStage;
		
		@FXML
	    private BorderPane mainBorderPane;
		
		@FXML
	    private ImageView imagenPerfil;
		
		@FXML
	    private void initialize() {
	    	
	    }
		
		/**
		 * Pasar de el  primarystage a secondstage
		 */
		@FXML
	    private void handleSend() {
			mygithubprofile.showProfileDetails();      
	    }


		public void setMygithubprofile(MyGithubProfile mygithubprofile) {
			this.mygithubprofile = mygithubprofile;
		}

		
		public void setDialogStage(Stage dialogStage) {
			 this.dialogStage = dialogStage;
			 this.dialogStage.centerOnScreen();
		     this.dialogStage.setResizable(false);
		}
		
	
		
		
}
