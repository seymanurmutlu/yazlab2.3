package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//this class controls Main.fxml file
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class FirstPageController {
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtMuslukSayisi;
	
	@FXML
	private TextField txtKapasite;
	
	public void TakeInfos(ActionEvent event ) {
		
	
		if( txtMuslukSayisi.getText().equals("") ||  txtKapasite.getText().equals("") ) {
			lblStatus.setText("Tum alanlari doldurunuz.");
			System.out.println("BOS");
		}else {
			
			
			lblStatus.setText("Generating Graph..");
		}
		System.out.println( "Musluk Sayisi: "+txtMuslukSayisi.getText() + "\nKapasite: " + txtKapasite.getText() );
		
	
	
	
	
	
	
	
	
	
	
	}
	

}
