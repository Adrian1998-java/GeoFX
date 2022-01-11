package dad.geofx.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Currency {

	@SerializedName("code")
	@Expose
	private String code;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("plural")
	@Expose
	private String plural;
	@SerializedName("symbol")
	@Expose
	private String symbol;
	@SerializedName("symbol_native")
	@Expose
	private String symbolNative;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Currency withCode(String code) {
		this.code = code;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Currency withName(String name) {
		this.name = name;
		return this;
	}

	public String getPlural() {
		return plural;
	}

	public void setPlural(String plural) {
		this.plural = plural;
	}

	public Currency withPlural(String plural) {
		this.plural = plural;
		return this;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Currency withSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public String getSymbolNative() {
		return symbolNative;
	}

	public void setSymbolNative(String symbolNative) {
		this.symbolNative = symbolNative;
	}

	public Currency withSymbolNative(String symbolNative) {
		this.symbolNative = symbolNative;
		return this;
	}
}
