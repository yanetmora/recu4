package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="site_personnel_roles")
public class SitePersonnelRole implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column 
	private int personnelId;
	
	@Column 
	private int roleId;
	
	@Column
	private int moduleId;
	
	public SitePersonnelRole( int personnelId, int roleId, int moduleId) {
		super();
		
		this.personnelId = personnelId;
		this.roleId = roleId;
		this.moduleId = moduleId;
	}
	public SitePersonnelRole(){
		this(0,0,0);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonnelId() {
		return personnelId;
	}
	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	@Override
	public String toString() {
		return "SitePersonnelRole [id=" + id + ", personnelId=" + personnelId + ", roleId=" + roleId + ", moduleId="
				+ moduleId + "]";
	}
	
	
	
	
}
