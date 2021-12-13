package example.y211214;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{
	  public MainApp() {   // 기본 생성자
	  }

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = (Parent)FXMLLoader.load(getClass().getResource("root.fxml"));
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
//        Parent root = loader.load();
		Scene scene = new Scene(parent);	
		
		primaryStage.setTitle("Main App");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
