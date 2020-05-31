package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;
//this class controls Main.fxml file
public class MainController {
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtMuslukSayisi;
	
	@FXML
	private TextField txtBoruSayisi;
	
	@FXML
	private TextField txtKapasite;
	
	public void TakeInfos(ActionEvent event ) {
		if( txtMuslukSayisi.getText().equals("") || txtBoruSayisi.getText().equals("") || txtKapasite.getText().equals("") ) {
			lblStatus.setText("Tum alanlari doldurunuz.");
			System.out.println("BOS");
		}else {
			lblStatus.setText("Generating Graph..");
			
		}
		System.out.println( txtMuslukSayisi.getText() + " " + txtBoruSayisi.getText() + " " + txtKapasite.getText() );
	}
	
	public void newLay(ActionEvent event ) {
        StackPane root2 = new StackPane();
        Label label = new Label("Your are now in the second form");
        root2.getChildren().add(label);
        Scene secondScene = new Scene(root2, 500,500);
        Stage secondStage = new Stage();
        secondStage.setScene(secondScene); // set the scene
        secondStage.setTitle("Second Form");
        secondStage.show();
	}
	

}
