package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Proj0<T extends Comparable<T>> extends Application {
	Label l3 =new Label(null);
	Label l4 =new Label(null);
	Label l5 =new Label(null);
	LinkedList <Integer > ln = new LinkedList<>();
	Node <T> head ;
	public Label trasverse() {
		Node < T> curr = head ; 
		l3.setText("HEAD ---> ");
		
		while(curr != null) {
			l4.setText(curr + "---->");
		curr = curr.getNext();
		return l4;
		}
		l5.setText("null");
		return l5;
		
	}
	
	

	
    
   
    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage arg0) throws Exception {
		ln.insert(60);
		ln.insert(70);
		ln.trasverse();
		BorderPane p1 = new BorderPane();
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		VBox v1 = new VBox(10);
		v1.getChildren().addAll(tf1 ,tf2);
		Button bt1 = new Button("delete");
		Button bt2 = new Button("insert");
		VBox v2 = new VBox(10);
		v2.getChildren().addAll(bt1 , bt2);
		Label l1 = new Label("Enter number to delete it  from list");
		Label l2 = new Label("Enter number to insert it to list");
		VBox v3 = new VBox(30);
		v3.getChildren().addAll(l1,l2);
		HBox h1 = new HBox(5);
		h1.getChildren().addAll(l3 , l4 , l5);
	//	p1.getChildren().addAll(v1 , v2 ,v3);
		p1.setLeft(v1);
		p1.setRight(v3);
		p1.setCenter(v2);
		p1.setBottom(h1);
		trasverse();
		//p1.setBottom(ln.trasverse());
		//p1.getChildren().addAll(ln.trasverse());
		bt1.setOnAction(e -> {
			l1.setText("Enter number to delete it  from list");
			String d = tf1.getText();
			int nd = Integer.parseInt(d);
			ln.delete(nd);
			l1.setText("the number was deleted");
			trasverse();
			ln.trasverse();
			
		});
		
		bt2.setOnAction(e -> {
			l2.setText("Enter number to insert it to list");
			String d = tf2.getText();
			int nd = Integer.parseInt(d);
			ln.insert(nd);
			l2.setText("the number was addedd");
			trasverse();
			ln.trasverse();
		});
		
		
		
		
		Scene s  = new Scene (p1 , 600 ,600);
		arg0.setScene(s);
		arg0.show();
				
		
	}
}
