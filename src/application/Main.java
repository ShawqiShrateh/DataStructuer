package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.application.Application;
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
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("lab 1");
        Tab tab2 = new Tab("lab 2");
        VBox tab1Content = new VBox();
        BorderPane t1 = new BorderPane();
        Button add = new Button("ADD");
        TextField add1 = new TextField();
        Button find = new Button("Find");
        TextField find1 = new TextField();
        Button delete = new Button("Delete");
        TextField delete1 = new TextField();
        Button load = new Button("Load");
        Button getMax = new Button("get total person");
        Button female = new Button("number of female");
        Button male = new Button("number of male");
        Button clear = new Button("clear");
        HBox h1 = new HBox(10);
        h1.getChildren().addAll(load, getMax, female , male , clear);
        VBox v1 = new VBox(10);
        v1.getChildren().addAll(add, find, delete);
        VBox v2 = new VBox(10);
        v2.getChildren().addAll(add1, find1, delete1);
        t1.setLeft(v1);
        t1.setCenter(v2);
        t1.setBottom(h1);
        add.setOnAction(e -> {
            StringBuilder content = new StringBuilder();
            Label l3 = new Label("add");
            Label l4 = new Label("added text:");
            MyList<String> list = new MyList<>(10); 
            try {
                File file = new File("names.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    content.append(line).append("\n");
                    String newline = add1.getText() + " " + line; 
                    list.add(newline);
                }
                sc.close();
                l4.setText(list.toString());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                l3.setText("File not found.");
            }
            l3.setText("added success");
            v2.getChildren().addAll(l3, l4);
        });

        
        
        getMax.setOnAction(e -> {
            Label l2 = new Label("count");
           int count = 0;
            try {
                File file = new File("names.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    count++;
                    sc.nextLine(); 
                }
                sc.close();
                l2.setText(Integer.toString(count)); 
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(); 
                l2.setText("File not found.");
            }
            v2.getChildren().add(l2);
        });
        
        delete.setOnAction(e -> {
            StringBuilder content = new StringBuilder();
            Label l5 = new Label("delete");
            Label l6 = new Label("deleted text:");
            MyList<String> list = new MyList<>(10); 
            try {
                File file = new File("names.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] content1 = line.split(",");
                    if (content1.length > 0) {
                        String Deleted = content1[0]; 
                        boolean deleted = list.delete(Deleted); 
                        if (deleted) {
                            content.append(Deleted).append("\n");
                        }
                    }
                }
                sc.close();
                l6.setText("Deleted items:\n" + content.toString()); 
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                l5.setText("File not found.");
            }
            v2.getChildren().addAll(l5, l6);
        });

        load.setOnAction(e -> {
            Label l1 = new Label();
            StringBuilder content = new StringBuilder();
            try {
                File file = new File("names.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }
                scanner.close();
                l1.setText(content.toString());
            } catch (FileNotFoundException ex) {
            	System.out.println(ex);
                l1.setText("File not found");
            }
            v2.getChildren().add(l1);
        });
        clear.setOnAction(e -> {
        	 
        });
        tab1Content.getChildren().addAll(t1);
        tab1.setContent(tab1Content);

        
        
        
        
        VBox tab2Content = new VBox();
        BorderPane b3 = new BorderPane();
        Button sum  = new Button("sum of digit");
        Button reverse = new Button("reverse statment");
        Button search = new Button("search");
        TextField sumf = new TextField("enter digit to sum ");
        TextField reversef = new TextField("enter statment to reverse");
        TextField searchf = new TextField("enter to search");
        VBox bt = new VBox(10);
        bt.getChildren().addAll(sum , reverse, search);
        VBox tf = new VBox(10);
        tf.getChildren().addAll(sumf , reversef , searchf);
        VBox lbl = new VBox(10);
        Label l1 = new Label(null);
        Label l2 = new Label(null);
        Label l3 = new Label(null);
        Text tl = new Text();
        lbl.getChildren().addAll(l1 , l2 , l3, tl);
        VBox v3 = new VBox(10);
        v3.getChildren().add(lbl);
        v3.setLayoutX(300);
        v3.setLayoutY(5);
        b3.setLeft(tf);
        b3.setCenter(bt);
       // b3.setRight(v3);
        b3.getChildren().add(v3);
        
        sum.setOnAction(e ->{
         //   ShawqiShreteh sh = new ShawqiShreteh();
        	try {
            String s1 = sumf.getText();
            int s =  ShawqiShreteh.sum(ShawqiShreteh.sum(Integer.parseInt(s1)));
            String val = String.valueOf(s);
            l1.setText(val);
        	}catch(InputMismatchException ex) {
        		System.out.println("error input");
        		l1.setText("error input , TRY AGAIN PLZ");
        	}
            
        });
        
        reverse.setOnAction(e -> {
        	String s = reversef.getText();
        	tl.setText(ShawqiShreteh.rev(s));
        	System.out.println(ShawqiShreteh.rev(s));
        });
        
        
        search.setOnAction(e -> {
            String S = searchf.getText();
            int[] arr = new int[S.length()];
            for (int i = 0; i < S.length(); i++) {
                arr[i] = Character.getNumericValue(S.charAt(i));
            }
            Arrays.sort(arr);
     
            int searchResult = ShawqiShreteh.binarySearch(arr);
  
            if (searchResult != -1) {
                tl.setText("Element found at index: " + searchResult);
            } else {
                tl.setText("Element not found");
            }
        });


        
        tab2Content.getChildren().add(b3);
        tab2.setContent(tab2Content);
        tabPane.getTabs().addAll(tab1, tab2);
        BorderPane root = new BorderPane();
        root.setCenter(tabPane);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Data Structuer");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
