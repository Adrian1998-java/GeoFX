package dad.geofx.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Connection {

	@SerializedName("asn")
	@Expose
	private Integer asn;
	@SerializedName("isp")
	@Expose
	private String isp;

	public Integer getAsn() {
		return asn;
	}

	public void setAsn(Integer asn) {
		this.asn = asn;
	}

	public Connection withAsn(Integer asn) {
		this.asn = asn;
		return this;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public Connection withIsp(String isp) {
		this.isp = isp;
		return this;
	}
}
