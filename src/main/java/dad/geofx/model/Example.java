package dad.geofx.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Example {

	@SerializedName("ip")
	@Expose
	private String ip;
	@SerializedName("hostname")
	@Expose
	private String hostname;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("continent_code")
	@Expose
	private String continentCode;
	@SerializedName("continent_name")
	@Expose
	private String continentName;
	@SerializedName("country_code")
	@Expose
	private String countryCode;
	@SerializedName("country_name")
	@Expose
	private String countryName;
	@SerializedName("region_code")
	@Expose
	private String regionCode;
	@SerializedName("region_name")
	@Expose
	private String regionName;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("zip")
	@Expose
	private String zip;
	@SerializedName("latitude")
	@Expose
	private Float latitude;
	@SerializedName("longitude")
	@Expose
	private Float longitude;
	@SerializedName("location")
	@Expose
	private Location location;
	@SerializedName("time_zone")
	@Expose
	private TimeZone timeZone;
	@SerializedName("currency")
	@Expose
	private Currency currency;
	@SerializedName("connection")
	@Expose
	private Connection connection;
	@SerializedName("security")
	@Expose
	private Security security;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Example withIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Example withHostname(String hostname) {
		this.hostname = hostname;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Example withType(String type) {
		this.type = type;
		return this;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public Example withContinentCode(String continentCode) {
		this.continentCode = continentCode;
		return this;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public Example withContinentName(String continentName) {
		this.continentName = continentName;
		return this;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Example withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Example withCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public Example withRegionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Example withRegionName(String regionName) {
		this.regionName = regionName;
		return this;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Example withCity(String city) {
		this.city = city;
		return this;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Example withZip(String zip) {
		this.zip = zip;
		return this;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Example withLatitude(Float latitude) {
		this.latitude = latitude;
		return this;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Example withLongitude(Float longitude) {
		this.longitude = longitude;
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Example withLocation(Location location) {
		this.location = location;
		return this;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Example withTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Example withCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Example withConnection(Connection connection) {
		this.connection = connection;
		return this;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public Example withSecurity(Security security) {
		this.security = security;
		return this;
	}

}