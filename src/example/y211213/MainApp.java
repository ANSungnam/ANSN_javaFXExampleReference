package example.y211213;

import java.util.Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	public MainApp() {  // 생성자
		System.out.println(Thread.currentThread().getName() + ": Main01() 호출");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() 호출");
		Parameters params = this.getParameters();
		Map<String, String> map = params.getNamed();
		String ip = map.get("ip");
		String port = map.get("port");
		System.out.println("ip: " + ip);
		System.out.println("port: " + port);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() 호출");
		
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);	
		
		primaryStage.setTitle("Main App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() 호출");
	}
}