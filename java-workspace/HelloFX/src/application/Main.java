package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,800,600,Color.SKYBLUE);
		stage.setTitle("Demo");
		stage.setResizable(false);
		//Image icon = new Image("icon.png");
		//stage.getIcons().add(icon);
		//stage.setFullScreen(true);
		//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		Text text = new Text();
		text.setText("Hello FX");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.WHITE);
		
		Line line = new Line();
		
		
		root.getChildren().add(text);
		stage.setScene(scene);		
		stage.show();
		
	}
	

}
