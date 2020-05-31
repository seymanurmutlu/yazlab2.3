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
	
	public int firstNd,secondNd,startNd,finishNd,capacity;
	
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField finishNode;
	
	@FXML
	private TextField startNode;
	
	@FXML
	private TextField firstNode;
	
	@FXML
	private TextField secondNode;
	
	@FXML
	private TextField txtCapacity;
	
	
	public void saveNodeInfos(ActionEvent event) {
		
		startNd=Integer.valueOf(startNode.getText());
		finishNd=Integer.valueOf(finishNode.getText());
		
		System.out.println("Baslangic Dugumu: "+startNd);
		System.out.println("Bitis Dugumu: "+finishNd);
		
		Graph graph = new SingleGraph("You are viewing the nodes");

        graph.setStrict(false);
        graph.setAutoCreate(true);
        
		for(int i=0;i< MainController.muslukSayisi;i++) {
			graph.addNode(i+"");
		}			
		 for (Node node : graph) {
			node.addAttribute("ui.label", node.getId());
			if(node.getId().equalsIgnoreCase(String.valueOf(startNd) ) || node.getId().equalsIgnoreCase(String.valueOf(finishNd))) {
				node.addAttribute("ui.style", "fill-color: rgb(0,100,255);");
			}
		 }  
		graph.display();
	}
	
	public void setGraph(ActionEvent event) {
	
		firstNd=Integer.valueOf(firstNode.getText());
		secondNd=Integer.valueOf(secondNode.getText());
		capacity=Integer.valueOf(txtCapacity.getText());
		
		System.out.println("Ilk Dugum: "+firstNd);
		System.out.println("Ikinci Dugum: "+secondNd);
		System.out.println("Kapasite Miktari: "+secondNd);
		
	}
	
	public void minFlow(ActionEvent event) {
		
		System.out.println("Min Flow");
	}
	
	public void maxFlow(ActionEvent event) {
		
		System.out.println("Max Flow");
	}

}
