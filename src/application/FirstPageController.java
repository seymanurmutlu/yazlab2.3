package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

//this class controls Main.fxml file
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class FirstPageController implements Initializable{
	
	public static int firstNd,secondNd,startNd,finishNd,capacity;
	public static ArrayList<EdgeInfo> edgeList=new ArrayList<EdgeInfo>();
	
	final ObservableList<EdgeInfo> data=FXCollections.observableArrayList();
	
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
     
     @FXML
     private TableView EdgeInfoTable;
     
     
    
     
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
		
		
	data.add(
				new EdgeInfo(
						String.valueOf(firstNode.getText()),
				String.valueOf(secondNode.getText()),
				String.valueOf(txtCapacity.getText())));
		
				firstNode.clear();
				secondNode.clear();
				txtCapacity.clear();
				
				
	}
	
	public void minFlow(ActionEvent event) {
		
		System.out.println("Min Flow");
	}
	
	public void maxFlow(ActionEvent event) {
		
		System.out.println("Max Flow");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	
		TableColumn firstColumn=new TableColumn("Birinci Dugum");
		TableColumn secondColumn=new TableColumn("Ikinci Dugum");
		TableColumn thirdColumn=new TableColumn("Kapasite");
		EdgeInfoTable.getColumns().addAll(firstColumn,secondColumn,thirdColumn);
	
		
		firstColumn.setCellValueFactory(new PropertyValueFactory<EdgeInfo,String>("firstNd"));
		secondColumn.setCellValueFactory(new PropertyValueFactory<EdgeInfo,String>("secondNd"));
		thirdColumn.setCellValueFactory(new PropertyValueFactory<EdgeInfo,String>("capacity"));
		
		EdgeInfoTable.setItems(data);
		
	}
	
	
	

}
