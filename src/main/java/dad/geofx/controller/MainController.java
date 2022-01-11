package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {

	
	//Model
	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();
	
	private StringProperty IP = new SimpleStringProperty();
	
//	private static final String BASE_URL = "http://api.ipapi.com/";
//	+IP+"?access_key=107f87c16d92602ec3fd52fbd82a1f35";
	
	//IP usable
	//https://ipapi.com/ip_api.php?ip={ip}
	
	//View
	@FXML
	private TextField IPTextfield;

	@FXML
	private Button checkIPButton;

	@FXML
	private Tab connectionTab;

	@FXML
	private Tab locationTab;

	@FXML
	private Tab securityTab;

	@FXML
	private BorderPane view;

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		//Tabs
		locationTab.setContent(locationController.getView());
		connectionTab.setContent(connectionController.getView());
		securityTab.setContent(securityController.getView());

		//TextFielIP
		IPTextfield.setText("78.30.26.41");
		
		
		//API key -> 107f87c16d92602ec3fd52fbd82a1f35
	}
	
	public BorderPane getView() {
		return view;
	}
	
	@FXML
	void onCheckButton(ActionEvent event) {

	}

}
