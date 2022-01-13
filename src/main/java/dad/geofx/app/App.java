package dad.geofx.app;

import dad.geofx.api.GeoService;
import dad.geofx.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	MainController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new MainController();
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(new Scene(controller.getView(), 500, 400));
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	public static void main(String[] args) throws Exception {
		launch(args);
		
		GeoService service = new GeoService();
		System.out.print(service.ConnectionData("81.33.202.189"));

	}

}
