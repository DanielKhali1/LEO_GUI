import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
	final String FONT_FAMILY = "Ariel";
	
	final int TEXTFIELD_WIDTH = 100;
	
	//colors
	final String BUTTON_TEXT_COLOR = "white";
	final String BUTTON_BACKGROUND_COLOR = "#636363";
	final String BUTTON_BORDER_COLOR = "#a1a1a1";

	final String PANE_BACKGROUND_COLOR = "#2e2e2e";
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		masterPaneSetup();
		
		primaryStage.setScene(scene);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.show();
	}
	
	/**
	 * adds all GUI Children Nodes to Master Pane
	 */
	private void masterPaneSetup() 
	{
		// INITIALIZING NODES
		
		tf outputTextField1 = new tf();
		outputTextField1.relocate(80, 30);
		
		VBox vb1 = new VBox();
		
		HBox hb1 = new HBox();
		HBox hb2 = new HBox();
		HBox hb3 = new HBox();
		HBox hb4 = new HBox();
		
		txt label1 = new txt(LABEL_1);
		txt label2 = new txt(LABEL_2);
		txt label3 = new txt(LABEL_3);
		txt label4 = new txt(LABEL_4);
		
		tf inptextfield1 = new tf();
		tf inptextfield2 = new tf();
		tf inptextfield3 = new tf();
		tf inptextfield4 = new tf();
		
		hb1.getChildren().addAll(label1, inptextfield1);
		hb2.getChildren().addAll(label2, inptextfield2);
		hb3.getChildren().addAll(label3, inptextfield3);
		hb4.getChildren().addAll(label4, inptextfield4);
		
		vb1.getChildren().addAll(hb1, hb2, hb3, hb4);
		hb1.setSpacing(20);
		hb2.setSpacing(20);
		hb3.setSpacing(20);
		hb4.setSpacing(20);
		vb1.setSpacing(20);
		
		vb1.relocate(20, 90);
		
		Line line = new Line(10, 290, 300, 290);
		line.setStroke(Color.WHITE);
		
		txt label5 = new txt(LABEL_5);
		txt label6 = new txt(LABEL_6);
		
		ComboBox dropDown1 = new ComboBox();
		ComboBox dropDown2 = new ComboBox();

		tf outputTextField2 = new tf();
		
		bt button1 = new bt(BUTTON_NAME_1);
		bt button2 = new bt(BUTTON_NAME_2);
		bt button3 = new bt(BUTTON_NAME_3);
		bt button4 = new bt(BUTTON_NAME_4);
		bt button5 = new bt(BUTTON_NAME_5);
		
		tf input1 = new tf();
		tf input2 = new tf();
		
		
		master_pane.getChildren().addAll(outputTextField1, vb1, line);
		master_pane.setStyle("-fx-background-color: " +  PANE_BACKGROUND_COLOR);
		// COLOR MODIFIER

		
	}

	public static void main(String[] args) {launch(args);}
	
	
	public class tf extends TextField
	{
		public tf()
		{
			setStyle("-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: " + BUTTON_TEXT_COLOR + "; -fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		}
	}
	
	public class bt extends Button
	{
		public bt(String name)
		{
			super(name);
			setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
			
			setOnMouseEntered(e->{
				setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_TEXT_COLOR + "; -fx-text-fill: "+ BUTTON_BACKGROUND_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
			});
			
			setOnMouseExited(e->{
				setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
			});
		}
		
	}
	
	public class txt extends Text
	{
		public txt(String name)
		{
			super(name);
			setFill(Color.WHITE);
			setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
