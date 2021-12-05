/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: nikfu(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.seb.pmt.ionische.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="DangerousEntity")
public class DangerousEntity implements Serializable {
	public DangerousEntity() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof DangerousEntity))
			return false;
		DangerousEntity dangerousentity = (DangerousEntity)aObj;
		if ((getName() != null && !getName().equals(dangerousentity.getName())) || (getName() == null && dangerousentity.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DANGEROUSENTITY_REGISTEREDUSERS) {
			return ORM_registeredUsers;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Name", nullable=false, length=255)	
	@Id	
	private String name;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="Picture", nullable=true, length=255)	
	private String picture;
	
	@ManyToMany(targetEntity=de.hhn.seb.pmt.ionische.model.RegisteredUser.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="RegisteredUser_DangerousEntity", joinColumns={ @JoinColumn(name="DangerousEntityName") }, inverseJoinColumns={ @JoinColumn(name="RegisteredUserUserId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_registeredUsers = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPicture(String value) {
		this.picture = value;
	}
	
	public String getPicture() {
		return picture;
	}
	
	private void setORM_RegisteredUsers(java.util.Set value) {
		this.ORM_registeredUsers = value;
	}
	
	private java.util.Set getORM_RegisteredUsers() {
		return ORM_registeredUsers;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.RegisteredUserSetCollection registeredUsers = new de.hhn.seb.pmt.ionische.model.RegisteredUserSetCollection(this, _ormAdapter, ORMConstants.KEY_DANGEROUSENTITY_REGISTEREDUSERS, ORMConstants.KEY_REGISTEREDUSER_DANGEROUSENTITIES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
