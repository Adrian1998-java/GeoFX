package dad.geofx.api;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ErrorMessage {

	@SerializedName("success")
	@Expose
	private Boolean success;
	@SerializedName("error")
	@Expose
	private Error error;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ErrorMessage withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public ErrorMessage withError(Error error) {
		this.error = error;
		return this;
	}

}