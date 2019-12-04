import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * 
 * @author dannykhalil
 * 
 *  MOCKUP GUI V1
 *
 */
public class GUI1 extends Application
{
	
	Pane master_pane = new Pane();
	Scene scene = new Scene(master_pane, 400, 400);
	
	
	// MODIFIABLE PARAMETERS OF GUI1
	
	final String WINDOW_TITLE = "GUI1";
	final String LABEL_1 = "Label 1";
	final String LABEL_2 = "Label 2";
	final String LABEL_3 = "Label 3";
	
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
		
		Text label1 = new Text(LABEL_1);
		Text label2 = new Text(LABEL_2);
		Text label3 = new Text(LABEL_3);
		
		TextField textfield1 = new TextField();
		TextField textfield2 = new TextField();
		
		Button button1 = new Button(BUTTON_NAME_1);
		Button button2 = new Button(BUTTON_NAME_2);
		Button button3 = new Button(BUTTON_NAME_3);
		Button button4 = new Button(BUTTON_NAME_4);
		Button button5 = new Button(BUTTON_NAME_5);
		Button button6 = new Button(BUTTON_NAME_6);
		
		VBox Vbutton1 = new VBox();
		VBox Vbutton2 = new VBox();
		HBox hbox1 = new HBox();
		
		HBox HText1 = new HBox();
		HBox HText2 = new HBox();
		
		// SETTING LOCATION OF NODES
		HText1.relocate(20, 40);
		HText2.relocate(20, 90);
		label3.relocate((scene.getWidth()/2) + 60, (scene.getHeight()/2) - 40);
		hbox1.getChildren().addAll(Vbutton1, Vbutton2);
		hbox1.relocate((scene.getWidth()/2), (scene.getHeight()/2)+20);
		
		// MODIFYING NODES TEXT SETTINGS
		label1.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";");
		label2.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";");
		label3.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";");
		
		button1.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		button2.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		button3.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		button4.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		button5.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		button6.setStyle("-fx-font-size: " + FONT_SIZE + "; -fx-font-family: "+ FONT_FAMILY +";" + "-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: "+ BUTTON_TEXT_COLOR + ";" + "-fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		
		//SETTING SPACING FOR HBOX & VBOX
		hbox1.setSpacing(20);
		HText2.setSpacing(10);
		HText1.setSpacing(10);
		Vbutton1.setSpacing(20);
		Vbutton2.setSpacing(20);
		
		//TEXT FIELD WIDTH
		textfield1.setPrefWidth(TEXTFIELD_WIDTH);
		textfield2.setPrefWidth(TEXTFIELD_WIDTH);
		
		//ADDING NODES TO SPECIFIED PANES
		HText1.getChildren().addAll(label1, textfield1);
		HText2.getChildren().addAll(label2, textfield2);
		Vbutton1.getChildren().addAll(button1,button2,button3);
		Vbutton2.getChildren().addAll(button4, button5, button6);
		
		//ADDING CREDIT BOI
		Text dannyTxt = new Text("GUI Provided\nby Daniel Khalil");
		dannyTxt.setStyle("-fx-font-size: 10");
		dannyTxt.relocate(20, 370);
		
		//ADD ALL NODES TO MASTER PANE
		master_pane.getChildren().addAll(label3, hbox1, HText1, HText2, dannyTxt);
		
		//COLOR ADDITIONS
		master_pane.setStyle("-fx-background-color: " + PANE_BACKGROUND_COLOR + ";");
		label1.setFill(Color.WHITE);
		label2.setFill(Color.WHITE);
		label3.setFill(Color.WHITE);
		
		textfield1.setStyle("-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: " + BUTTON_TEXT_COLOR + "; -fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		textfield2.setStyle("-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-text-fill: " + BUTTON_TEXT_COLOR + "; -fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		
	}

	public static void main(String[] args) {launch(args);}
	
	
	
	
	
	
	
	
	
	
	
	
}
