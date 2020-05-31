package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
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
=======
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
	

>>>>>>> 0e87cc1f0e97e2ff2eb3600a415a889afcd8c549
}
