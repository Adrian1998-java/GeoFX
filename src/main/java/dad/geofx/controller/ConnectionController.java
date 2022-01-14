package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.model.Example;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {

	// Model
	private ObjectProperty<Example> example = new SimpleObjectProperty<Example>();

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
		example.addListener((o, ov, nv) -> onExampleChanged(o, ov, nv));

	}

	private void onExampleChanged(ObservableValue<? extends Example> o, Example ov, Example nv) {

		if (nv != null) {
			IPAddressLabel.setText(nv.getIp());
			ISPLabel.setText(nv.getConnection().getIsp());
			typeLabel.setText(nv.getType());
			ASNLabel.setText(nv.getConnection().getAsn().toString());
			hostnameLabel.setText(nv.getHostname());

		}
	}

	public GridPane getView() {
		return view;
	}

	public final ObjectProperty<Example> exampleProperty() {
		return this.example;
	}

	public final Example getExample() {
		return this.exampleProperty().get();
	}

	public final void setExample(final Example example) {
		this.exampleProperty().set(example);
	}

}
