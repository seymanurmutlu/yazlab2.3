package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;

public class FirstPageController {
	@FXML
	private TextField txtMuslukSayisi;
	
	public void TakeMuslukSayisi(ActionEvent event ) {
		if( txtMuslukSayisi.getText().equals("0") ||  txtMuslukSayisi.getText().equals("1"))
			System.out.println("Musluk sayisi parameter must be bigger than 1 int");
		
			System.out.println(txtMuslukSayisi.getText());
		
		
	}
}
