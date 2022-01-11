package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	@FXML
	private Label IPLabel;

	@FXML
	private Label callingLabel;

	@FXML
	private Label cityStateLabel;

	@FXML
	private Label currencyLabel;

	@FXML
	private ImageView flagLabel;

	@FXML
	private Label languajeLabel;

	@FXML
	private Label latitudeLabel;

	@FXML
	private Label longitudeLabel;

	@FXML
	private Label timeZoneLabel;

	@FXML
	private GridPane view;

	@FXML
	private Label zipLabel;

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public GridPane getView() {
		return view;
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
