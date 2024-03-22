package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,800,600,Color.BLACK);
		
		//Image icon = new Image("icon.png");
		//stage.getIcons().add(icon);
		
		stage.setTitle("Demo");
		stage.setResizable(false);
		//stage.setFullScreen(true);
		//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		stage.setScene(scene);		
		stage.show();
		
	}
	

}
