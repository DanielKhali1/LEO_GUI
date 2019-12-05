
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
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
public class GUI3 extends Application
{
	
	Pane master_pane = new Pane();
	Scene scene = new Scene(master_pane, 450, 450);
	
	final String WINDOW_TITLE = "GUI1";
	final String BUTTON_NAME_1 = "Button 1";
	final String BUTTON_NAME_2 = "Button 2";
	final int FONT_SIZE = 15;
	final String FONT_FAMILY = "Ariel";
	final int TEXTFIELD_WIDTH = 100;
	
	//colors
	final String BUTTON_TEXT_COLOR = "white";
	final String BUTTON_BACKGROUND_COLOR = "#636363";
	final String BUTTON_BORDER_COLOR = "#a1a1a1";
	final String PANE_BACKGROUND_COLOR = "#2e2e2e";
	final String TAB_BACKGROUND_COLOR = "#3b3b3b";

	
	bt button1;
	bt button2;
	TextArea ta;

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		button1 = new bt(BUTTON_NAME_1);
		button2 = new bt(BUTTON_NAME_2);
		ta = new TextArea();
		
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
		
		master_pane.setStyle("-fx-background-color: "+ PANE_BACKGROUND_COLOR + ";");
		
		ScrollPane sp = new ScrollPane();
		ta.setPrefSize(400, 300);
		ta.setStyle("-fx-background-color: " + BUTTON_BACKGROUND_COLOR + "; -fx-border-color: " + BUTTON_BORDER_COLOR + ";");
		ta.setWrapText(true);
		
		sp.relocate(20, 20);
		sp.setContent(ta);
		
		button1.relocate(20, 350);
		button2.relocate(345, 350);
		
		master_pane.getChildren().addAll(sp,button1,button2);
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

