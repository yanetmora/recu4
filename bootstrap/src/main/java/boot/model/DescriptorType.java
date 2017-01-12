package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="descriptor_types")
public class DescriptorType implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String code;
	@Column (length=45)
	private String name;
	@Column(length=45)
	private String length;
	@Column(length=45)
	private String unit;
	@Column(length=45)
	private String descr;
	public DescriptorType( String code, String name, String length, String unit, String descr) {
		super();
		this.code = code;
		this.name = name;
		this.length = length;
		this.unit = unit;
		this.descr = descr;
	}
	public DescriptorType(){
	this("","","","","");	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public String toString() {
		return "DescriptorType [id=" + id + ", code=" + code + ", name=" + name + ", length=" + length + ", unit="
				+ unit + ", descr=" + descr + "]";
	}
	
	
	
	
	
}
