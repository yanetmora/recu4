package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="peers")
public class Peer implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int peerId;
	
	@Column (length=45)
	private String alias;
	
	@Column (length=45)
	private String login;
	
	@Column (length=45)
	private String password;
	
	@Column(length=2)
	private String countryCode;
	
	@Column(length=45)
	
	private String ipEndPoint;
	@Column
	private boolean behindFirewall;
	public Peer( String alias, String login, String password, String countryCode, String ipEndPoint,
			boolean behindFirewall) {
		super();

		this.alias = alias;
		this.login = login;
		this.password = password;
		this.countryCode = countryCode;
		this.ipEndPoint = ipEndPoint;
		this.behindFirewall = behindFirewall;
	}
	public Peer(){
		this("","","","","",false);
	}
	public int getPeerId() {
		return peerId;
	}
	public void setPeerId(int peerId) {
		this.peerId = peerId;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getIpEndPoint() {
		return ipEndPoint;
	}
	public void setIpEndPoint(String ipEndPoint) {
		this.ipEndPoint = ipEndPoint;
	}
	public boolean isBehindFirewall() {
		return behindFirewall;
	}
	public void setBehindFirewall(boolean behindFirewall) {
		this.behindFirewall = behindFirewall;
	}
	@Override
	public String toString() {
		return "Peer [peerId=" + peerId + ", alias=" + alias + ", login=" + login + ", password=" + password
				+ ", countryCode=" + countryCode + ", ipEndPoint=" + ipEndPoint + ", behindFirewall=" + behindFirewall
				+ "]";
	}
	
	
	
	
	
	
	
}
