package dad.geofx.api;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Error {

	@SerializedName("code")
	@Expose
	private Integer code;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("info")
	@Expose
	private String info;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Error withCode(Integer code) {
		this.code = code;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Error withType(String type) {
		this.type = type;
		return this;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Error withInfo(String info) {
		this.info = info;
		return this;
	}

}