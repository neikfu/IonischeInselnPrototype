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
@Table(name="PublicService")
public class PublicService implements Serializable {
	public PublicService() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof PublicService))
			return false;
		PublicService publicservice = (PublicService)aObj;
		if ((getName() != null && !getName().equals(publicservice.getName())) || (getName() == null && publicservice.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PUBLICSERVICE_REGISTEREDUSER) {
			this.registeredUser = (de.hhn.seb.pmt.ionische.model.RegisteredUser) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Name", nullable=false, length=255)	
	@Id	
	private String name;
	
	@ManyToOne(targetEntity=de.hhn.seb.pmt.ionische.model.RegisteredUser.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="RegisteredUserUserId2", referencedColumnName="UserId", nullable=false) }, foreignKey=@ForeignKey(name="looksUp3"))	
	private de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="PhoneNumber", nullable=true, length=255)	
	private String phoneNumber;
	
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
	
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setRegisteredUser(de.hhn.seb.pmt.ionische.model.RegisteredUser value) {
		if (registeredUser != null) {
			registeredUser.publicService.remove(this);
		}
		if (value != null) {
			value.publicService.add(this);
		}
	}
	
	public de.hhn.seb.pmt.ionische.model.RegisteredUser getRegisteredUser() {
		return registeredUser;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RegisteredUser(de.hhn.seb.pmt.ionische.model.RegisteredUser value) {
		this.registeredUser = value;
	}
	
	private de.hhn.seb.pmt.ionische.model.RegisteredUser getORM_RegisteredUser() {
		return registeredUser;
	}
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
