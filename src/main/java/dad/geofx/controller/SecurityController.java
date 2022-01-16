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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {

	// Model
	private ObjectProperty<Example> example = new SimpleObjectProperty<Example>();

	@FXML
	private Label IPSafeLabel;

	@FXML
	private CheckBox crawlerCheck;

	@FXML
	private Label potentialThreatsLabel;

	@FXML
	private CheckBox proxyCheck;

	@FXML
	private Label threatLevelLabel;

	@FXML
	private CheckBox torCheck;

	@FXML
	private GridPane view;

	public SecurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		example.addListener((o, ov, nv) -> onExampleChanged(o, ov, nv));
		
		crawlerCheck.setDisable(true);
		proxyCheck.setDisable(true);
		torCheck.setDisable(true);
	}

	private void onExampleChanged(ObservableValue<? extends Example> o, Example ov, Example nv) {
		if (nv != null) {
			
			proxyCheck.setSelected(nv.getSecurity().getIsProxy());
			torCheck.setSelected(nv.getSecurity().getIsTor());
			crawlerCheck.setSelected(nv.getSecurity().getIsCrawler());
			threatLevelLabel.setText(nv.getSecurity().getThreatLevel());
			if (nv.getSecurity().getThreatTypes() == null) {
				potentialThreatsLabel.setText("No threat detected");
			}
			else
			{
				potentialThreatsLabel.setText("One or more threats were detected!");
			}
			if((!nv.getSecurity().getIsCrawler())&&(!nv.getSecurity().getIsProxy())&&(!nv.getSecurity().getIsTor()))
			{
				IPSafeLabel.setText("This IP is safe. No threats have been detected");
			}
			else
			{
				IPSafeLabel.setText("This IP is NOT safe. One or more threats have been detected");
			}
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
