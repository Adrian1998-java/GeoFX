package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import dad.geofx.model.Example;
import dad.geofx.model.Language;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	// Model
	private ObjectProperty<Example> example = new SimpleObjectProperty<Example>();

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

		example.addListener((o, ov, nv) -> onExampleChanged(o, ov, nv));
	}

	private void onExampleChanged(ObservableValue<? extends Example> o, Example ov, Example nv) {

		if (nv != null) {
			IPLabel.setText(nv.getCountryName() + "(" + nv.getContinentCode() + ")");
			latitudeLabel.setText(nv.getLatitude().toString());
			longitudeLabel.setText(nv.getLongitude().toString());
			flagLabel.setImage(new Image("/images/96x64/" + nv.getCountryCode() + ".png"));
			cityStateLabel.setText(nv.getCity() + "(" + nv.getRegionName() + ")");
			zipLabel.setText(nv.getZip());
			languajeLabel.setText(getAllLanguages(nv.getLocation().getLanguages()));
			timeZoneLabel.setText(nv.getTimeZone().getCurrentTime());
			callingLabel.setText("+" + nv.getLocation().getCallingCode());
			currencyLabel.setText(nv.getCurrency().getName()+"("+nv.getCurrency().getSymbol()+")");
		}

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

	/**
	 * Método para recoger los nombres de Idiomas de la clase Lenguaje
	 * 
	 * @param language Las lista de lenguajes de la clase Location
	 * @return
	 */
	public String getAllLanguages(List<Language> language) {

		String allLanguages = "";

		for (int i = 0; i < language.size(); i++) {
			allLanguages += language.get(i).getName();
			if ((i != language.size()) || (i == 0))
				allLanguages += ", ";
		}

		return allLanguages;
	}

}
