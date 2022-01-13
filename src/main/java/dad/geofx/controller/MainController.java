package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.google.gson.Gson;

import dad.geofx.api.GeoService;
import dad.geofx.model.Example;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
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

	// Model
	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();

	private StringProperty IP = new SimpleStringProperty();

	private GeoService geoService = new GeoService();
	
	private ObjectProperty<Example> example = new SimpleObjectProperty<Example>();

	private static final String BASE_URL = "https://ipapi.com/ip_api.php?ip=";

	// IP usable
	// https://ipapi.com/ip_api.php?ip={ip}

	// View
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
		// Tabs
		locationTab.setContent(locationController.getView());
		connectionTab.setContent(connectionController.getView());
		securityTab.setContent(securityController.getView());

		// TextFielIP
		IPTextfield.setText("8.8.8.8");
	}

	public BorderPane getView() {
		return view;
	}

	@FXML
	void onCheckButton(ActionEvent event) {
		try {
			System.out.println(geoService.ConnectionData(IP.getValue()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Gson gson = new Gson();
//		gson.fromJson("GsonenCrudo", Example.class)
	}

}
