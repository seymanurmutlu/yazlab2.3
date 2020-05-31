package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.Parent;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//KAYNAKCA
//	youtube.com/watch?v=C-ReKeKSQrw JavaFx multiple screens 

public class Main extends Application {
	static AnchorPane root;
	static List<GridPane> grid = new ArrayList<GridPane>();
	private static int currIndex = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
				
		root = (AnchorPane)FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		
		grid.add((GridPane)FXMLLoader.load(getClass().getResource("/application/First.fxml")));
		grid.add((GridPane)FXMLLoader.load(getClass().getResource("/application/Second.fxml")));
		grid.add((GridPane)FXMLLoader.load(getClass().getResource("/application/Third.fxml")));

		root.getChildren().add(grid.get(0));
//		Scene scene = new Scene(root,500,500);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Havuz Problemi");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void init_app() {}

	public static GridPane getPane(int index) {
		return grid.get(index);
	}
	public static void setPane(int index) {
		root.getChildren().remove(grid.get(currIndex));
		root.getChildren().add(grid.get(index));
		currIndex = index;
	}
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		Graph graph = new SingleGraph("Tutorial 1");

		
		graph.addNode("A" );
		graph.addNode("B" );
		graph.addNode("C");
		
		graph.addEdge("AB", "A", "B");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CA", "C", "A");
		
		  for (Node node : graph) {
		        node.addAttribute("ui.label", node.getId());
		    }
		  
		graph.display();

		launch(args);
	}
	
}
