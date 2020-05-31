package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

//this class controls Main.fxml file
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class MainController{
	
	public int muslukSayisi;
	
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtMuslukSayisi;
	
	
	public void TakeInfos() {
		
		if( txtMuslukSayisi.getText().equals("")) {
			lblStatus.setText("Lutfen Musluk Sayisini Giriniz!");
			System.out.println("BOS");
		}else {
			
			lblStatus.setText("Generating Graph..");
		}
		
	}
	
	@FXML
	public void TakeMuslukSayisi(ActionEvent event) {
		
		TakeInfos();
		
		muslukSayisi=Integer.valueOf(txtMuslukSayisi.getText());
		System.out.println( "Musluk Sayisi: "+txtMuslukSayisi.getText());
		
		Main.set_Pane(1);
	}

	
	

}
