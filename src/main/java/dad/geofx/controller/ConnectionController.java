package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {

	@FXML
    private Label ASNLabel;

    @FXML
    private Label IPAddressLabel;

    @FXML
    private Label ISPLabel;

    @FXML
    private Label hostnameLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private GridPane view;
	
	public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public GridPane getView() {
		return view;
	}

}
