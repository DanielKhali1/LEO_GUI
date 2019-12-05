import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * 
 * @author dannykhalil
 * 
 *  MOCKUP GUI V1
 *
 */
public class GUI2 extends Application
{
	Pane master_pane = new Pane();
	Scene scene = new Scene(master_pane, 700, 500);
	
	// MODIFIABLE PARAMETERS OF GUI1
	final String WINDOW_TITLE = "GUI1";
	final String LABEL_1 = "Label 1";
	final String LABEL_2 = "Label 2";
	final String LABEL_3 = "Label 3";
	final String LABEL_4 = "Label 4";
	final String LABEL_5 = "Label 5";
	final String LABEL_6 = "Label 6";
	
	final String BUTTON_NAME_1 = "Button 1";
	final String BUTTON_NAME_2 = "Button 2";
	final String BUTTON_NAME_3 = "Button 3";
	final String BUTTON_NAME_4 = "Button 4";	
	final String BUTTON_NAME_5 = "Button 5";
	final String BUTTON_NAME_6 = "Button 6";
	
	final int FONT_SIZE = 15;
	final String FONT_FAMILY = "Arial";
	final int TEXTFIELD_WIDTH = 100;
	
	//colors
	final String BUTTON_TEXT_COLOR = "white";
	final String BUTTON_BACKGROUND_COLOR = "#636363";
	final String BUTTON_BORDER_COLOR = "#a1a1a1";
	final String PANE_BACKGROUND_COLOR = "#2e2e2e";
	final String TAB_BACKGROUND_COLOR = "#3b3b3b";

	Pane tab1Pane = new Pane();
	Pane tab2Pane = new Pane();
	Pane tab3Pane = new Pane();
	Pane tab4Pane = new Pane();
	
	bt button1;
	bt button2;
	bt button3;
	bt button4;
	bt button5;
	tf input1;
	tf input2;
	ComboBox dropDown1;
	ComboBox dropDown2;
	tf inptextfield1;
	tf inptextfield2;
	tf inptextfield3;
	tf inptextfield4;
	TabPane tabpane;
	tf outputTextField1;
	tf outputTextField2;
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		
		initializeNodes();
		masterPaneSetup();
		buttonActions();
		dropDownSetup();
		tabPaneSetup();
		
		primaryStage.setScene(scene);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.show();
	}

	/**
	 * <p> Initializes all nodes that can or will contain action events </p>
	 */
	private void initializeNodes() 
	{
		outputTextField1 = new tf();
		button4 = new bt(BUTTON_NAME_4);
		button5 = new bt(BUTTON_NAME_5);
		input1 = new tf();
		input2 = new tf();
		dropDown1 = new ComboBox();
		dropDown2 = new ComboBox();
		inptextfield1 = new tf();
		inptextfield2 = new tf();
		inptextfield3 = new tf();
		inptextfield4 = new tf();
		button1 = new bt(BUTTON_NAME_1);
		button2 = new bt(BUTTON_NAME_2);
		button3 = new bt(BUTTON_NAME_3);
		tabpane = new TabPane();
		outputTextField2 = new tf();		
	}

	/**
	 * <p>adds and does layout for all GUI Children Nodes to Master Pane</p>
	 */
	private void masterPaneSetup() 
	{
		HBox hb1 = new HBox();
		HBox hb2 = new HBox();
		HBox hb3 = new HBox();
		HBox hb4 = new HBox();
		HBox hb5 = new HBox();
		HBox hb6 = new HBox();
		HBox hb7 = new HBox();
		HBox hb8 = new HBox();
		HBox hb9 = new HBox();
		VBox vb1 = new VBox();
		VBox vb2 = new VBox();
		VBox vb3 = new VBox();
		txt label1 = new txt(LABEL_1);
		txt label2 = new txt(LABEL_2);
		txt label3 = new txt(LABEL_3);
		txt label4 = new txt(LABEL_4);
		txt label5 = new txt(LABEL_5);
		txt label6 = new txt(LABEL_6);
		Line line = new Line(10, 290, 300, 290);

		line.setStroke(Color.WHITE);
		
		//sets location of nodes
		outputTextField1.relocate(80, 30);
		hb7.relocate(40, 430);
		vb3.relocate(400, 30);
		vb2.relocate(20, 320);
		vb1.relocate(20, 90);
		
		//sets spacing on the HBoxes
		hb1.setSpacing(20);
		hb2.setSpacing(20);
		hb3.setSpacing(20);
		hb4.setSpacing(20);
		hb5.setSpacing(20);
		hb6.setSpacing(20);
		hb7.setSpacing(20);
		hb8.setSpacing(20);
		hb9.setSpacing(20);
		
		//sets spacing on the VBoxes
		vb2.setSpacing(20);
		vb1.setSpacing(20);
		vb3.setSpacing(20);
				
		//adds nodes to HBoxes
		hb1.getChildren().addAll(label1, inptextfield1);
		hb2.getChildren().addAll(label2, inptextfield2);
		hb3.getChildren().addAll(label3, inptextfield3);
		hb4.getChildren().addAll(label4, inptextfield4);
		hb5.getChildren().add(button1);
		hb6.getChildren().add(button2);
		hb7.getChildren().addAll(outputTextField2, button3);
		hb5.getChildren().addAll(label5, dropDown1);
		hb6.getChildren().addAll(label6, dropDown2);
		hb8.getChildren().addAll(button4, input1);
		hb9.getChildren().addAll(button5, input2);
		
		//adds nodes hboxes to specified vboxes 
		vb1.getChildren().addAll(hb1, hb2, hb3, hb4);
		vb2.getChildren().addAll(hb5, hb6);
		vb3.getChildren().addAll(hb8, hb9);
		master_pane.getChildren().addAll(outputTextField1, vb1, line, vb2, hb7, vb3, tabpane);
		
		master_pane.setStyle("-fx-background-color: " +  PANE_BACKGROUND_COLOR);
		
	}

	/**
	 * <p>sets up the tab pane</p>
	 */
	private void tabPaneSetup() 
	{
		tab1Pane.setPrefSize(250, 300);
		tab2Pane.setPrefSize(250, 300);
		tab3Pane.setPrefSize(250, 300);
		tab4Pane.setPrefSize(250, 300);

		tab1Pane.setStyle("-fx-background-color: "+ TAB_BACKGROUND_COLOR +"; -fx-border-color: " + BUTTON_BACKGROUND_COLOR + ";");
		tab2Pane.setStyle("-fx-background-color: "+ TAB_BACKGROUND_COLOR +"; -fx-border-color: " + BUTTON_BACKGROUND_COLOR + ";");
		tab3Pane.setStyle("-fx-background-color: "+ TAB_BACKGROUND_COLOR +"; -fx-border-color: " + BUTTON_BACKGROUND_COLOR + ";");
		tab4Pane.setStyle("-fx-background-color: "+ TAB_BACKGROUND_COLOR +"; -fx-border-color: " + BUTTON_BACKGROUND_COLOR + ";");

		tabpane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
		tabpane.relocate(400, 150);
		tabpane.getTabs().add(new Tab("Tab 1", tab1Pane));
		tabpane.getTabs().add(new Tab("Tab 2", tab2Pane));
		tabpane.getTabs().add(new Tab("Tab 3", tab3Pane));
		tabpane.getTabs().add(new Tab("Tab 4", tab4Pane));		
		
	}
	
	/**
	 * <p> sets up both comboboxes </p>
	 */
	private void dropDownSetup() 
	{
		// TEMPORARY DROPDOWN SETUP
		for(int i = 0; i < 5; i++)
		{
			dropDown1.getItems().add("Drop Down 1:  " + (i+1));
			dropDown2.getItems().add("Drop Down 2:  " + (i+1));
		}
		
		// allows the combo box's to have a default item
		dropDown1.getSelectionModel().selectFirst();
		dropDown2.getSelectionModel().selectFirst();
	}


	/**
	 * <p>sets up all button action events</p>
	 */
	private void buttonActions() 
	{		
		button1.setOnAction(e->{
			button1event();
		});
		button2.setOnAction(e->{
			button2event();
		});
		button3.setOnAction(e->{
			button3event();
		});
		button4.setOnAction(e->{
			button4event();
		});
		button5.setOnAction(e->{
			button5event();
		});
		
	}

	

	/**
	 * <p> button event that will execute through an on action </p>
	 */
	private void button5event() 
	{
		//TODO: fill me in
		System.out.println("button 5 was pressed");
	}

	/**
	 * <p> button event that will execute through an on action </p>
	 */
	private void button4event() 
	{
		//TODO: fill me in
		System.out.println("button 4 was pressed");
	}

	/**
	 * <p> button event that will execute through an on action </p>
	 */
	private void button3event() 
	{
		//TODO: fill me in
		System.out.println("button 3 was pressed");
	}

	/**
	 * <p> button event that will execute through an on action </p>
	 */
	private void button2event() 
	{
		//TODO: fill me in
		System.out.println("button 2 was pressed");
	}

	/**
	 * <p> button event that will execute through an on action </p>
	 */
	private void button1event() 
	{
		//TODO: fill me in
		System.out.println("button 1 was pressed");
	}
	
	public static void main(String[] args) {launch(args);}
	
	
	/**
	 * <h1> Custom Text Field Node Class </h1>
	 * @author Danny
	 */
	public class tf extends TextField
	{
		public tf()
		{
			setStyle("-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: " + BUTTON_TEXT_COLOR + "; -fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		}
	}

	/**
	 * <h1> Custom Button Node Class </h1>
	 * @author Danny
	 */
	public class bt extends Button
	{
		public bt(String name)
		{
			super(name);
			setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: '"+ FONT_FAMILY +"';" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
			setOnMouseEntered(e->{setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: '"+ FONT_FAMILY +"';" + "-fx-background-color: " + BUTTON_TEXT_COLOR + "; -fx-text-fill: "+ BUTTON_BACKGROUND_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");});
			setOnMouseExited(e->{setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: '"+ FONT_FAMILY +"';" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");});
		}
	}
	/**
	 * <h1> Custom Text Node Class </h1>
	 * @author Danny
	 */	
	public class txt extends Text
	{
		public txt(String name)
		{
			super(name);
			setFill(Color.WHITE);
			setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: '"+ FONT_FAMILY +"';" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";");
		}
	}
	
}
