package dad.geofx.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TimeZone {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("current_time")
	@Expose
	private String currentTime;
	@SerializedName("gmt_offset")
	@Expose
	private Integer gmtOffset;
	@SerializedName("code")
	@Expose
	private String code;
	@SerializedName("is_daylight_saving")
	@Expose
	private Boolean isDaylightSaving;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TimeZone withId(String id) {
		this.id = id;
		return this;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public TimeZone withCurrentTime(String currentTime) {
		this.currentTime = currentTime;
		return this;
	}

	public Integer getGmtOffset() {
		return gmtOffset;
	}

	public void setGmtOffset(Integer gmtOffset) {
		this.gmtOffset = gmtOffset;
	}

	public TimeZone withGmtOffset(Integer gmtOffset) {
		this.gmtOffset = gmtOffset;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public TimeZone withCode(String code) {
		this.code = code;
		return this;
	}

	public Boolean getIsDaylightSaving() {
		return isDaylightSaving;
	}

	public void setIsDaylightSaving(Boolean isDaylightSaving) {
		this.isDaylightSaving = isDaylightSaving;
	}

	public TimeZone withIsDaylightSaving(Boolean isDaylightSaving) {
		this.isDaylightSaving = isDaylightSaving;
		return this;
	}

}
