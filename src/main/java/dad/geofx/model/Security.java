package dad.geofx.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Security {

	@SerializedName("is_proxy")
	@Expose
	private Boolean isProxy;
	@SerializedName("proxy_type")
	@Expose
	private Object proxyType;
	@SerializedName("is_crawler")
	@Expose
	private Boolean isCrawler;
	@SerializedName("crawler_name")
	@Expose
	private Object crawlerName;
	@SerializedName("crawler_type")
	@Expose
	private Object crawlerType;
	@SerializedName("is_tor")
	@Expose
	private Boolean isTor;
	@SerializedName("threat_level")
	@Expose
	private String threatLevel;
	@SerializedName("threat_types")
	@Expose
	private Object threatTypes;

	public Boolean getIsProxy() {
		return isProxy;
	}

	public void setIsProxy(Boolean isProxy) {
		this.isProxy = isProxy;
	}

	public Security withIsProxy(Boolean isProxy) {
		this.isProxy = isProxy;
		return this;
	}

	public Object getProxyType() {
		return proxyType;
	}

	public void setProxyType(Object proxyType) {
		this.proxyType = proxyType;
	}

	public Security withProxyType(Object proxyType) {
		this.proxyType = proxyType;
		return this;
	}

	public Boolean getIsCrawler() {
		return isCrawler;
	}

	public void setIsCrawler(Boolean isCrawler) {
		this.isCrawler = isCrawler;
	}

	public Security withIsCrawler(Boolean isCrawler) {
		this.isCrawler = isCrawler;
		return this;
	}

	public Object getCrawlerName() {
		return crawlerName;
	}

	public void setCrawlerName(Object crawlerName) {
		this.crawlerName = crawlerName;
	}

	public Security withCrawlerName(Object crawlerName) {
		this.crawlerName = crawlerName;
		return this;
	}

	public Object getCrawlerType() {
		return crawlerType;
	}

	public void setCrawlerType(Object crawlerType) {
		this.crawlerType = crawlerType;
	}

	public Security withCrawlerType(Object crawlerType) {
		this.crawlerType = crawlerType;
		return this;
	}

	public Boolean getIsTor() {
		return isTor;
	}

	public void setIsTor(Boolean isTor) {
		this.isTor = isTor;
	}

	public Security withIsTor(Boolean isTor) {
		this.isTor = isTor;
		return this;
	}

	public String getThreatLevel() {
		return threatLevel;
	}

	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
	}

	public Security withThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
		return this;
	}

	public Object getThreatTypes() {
		return threatTypes;
	}

	public void setThreatTypes(Object threatTypes) {
		this.threatTypes = threatTypes;
	}

	public Security withThreatTypes(Object threatTypes) {
		this.threatTypes = threatTypes;
		return this;
	}

}