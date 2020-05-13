package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
	

}
