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
@Table(name="MapModificationRequest")
public class MapModificationRequest implements Serializable {
	public MapModificationRequest() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MAPMODIFICATIONREQUEST_REGISTEREDUSER) {
			this.registeredUser = (de.hhn.seb.pmt.ionische.model.RegisteredUser) owner;
		}
		
		else if (key == ORMConstants.KEY_MAPMODIFICATIONREQUEST_REQUESTEDELEMENT) {
			this.requestedElement = (de.hhn.seb.pmt.ionische.model.MapElement) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ModificationRequestId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SEB_PMT_IONISCHE_MODEL_MAPMODIFICATIONREQUEST_MODIFICATIONREQUESTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SEB_PMT_IONISCHE_MODEL_MAPMODIFICATIONREQUEST_MODIFICATIONREQUESTID_GENERATOR", strategy="native")	
	private int modificationRequestId;
	
	@ManyToOne(targetEntity=de.hhn.seb.pmt.ionische.model.RegisteredUser.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="RegisteredUserUserId", referencedColumnName="UserId", nullable=false) }, foreignKey=@ForeignKey(name="submits"))	
	private de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@ManyToOne(targetEntity=de.hhn.seb.pmt.ionische.model.MapElement.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MapElementElementId", referencedColumnName="ElementId", nullable=false) }, foreignKey=@ForeignKey(name="reconsiders"))	
	private de.hhn.seb.pmt.ionische.model.MapElement requestedElement;
	
	private void setModificationRequestId(int value) {
		this.modificationRequestId = value;
	}
	
	public int getModificationRequestId() {
		return modificationRequestId;
	}
	
	public int getORMID() {
		return getModificationRequestId();
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setRegisteredUser(de.hhn.seb.pmt.ionische.model.RegisteredUser value) {
		if (registeredUser != null) {
			registeredUser.mapModificatioRequest.remove(this);
		}
		if (value != null) {
			value.mapModificatioRequest.add(this);
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
	
	public void setRequestedElement(de.hhn.seb.pmt.ionische.model.MapElement value) {
		if (requestedElement != null) {
			requestedElement.mapModificationRequests.remove(this);
		}
		if (value != null) {
			value.mapModificationRequests.add(this);
		}
	}
	
	public de.hhn.seb.pmt.ionische.model.MapElement getRequestedElement() {
		return requestedElement;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RequestedElement(de.hhn.seb.pmt.ionische.model.MapElement value) {
		this.requestedElement = value;
	}
	
	private de.hhn.seb.pmt.ionische.model.MapElement getORM_RequestedElement() {
		return requestedElement;
	}
	
	public String toString() {
		return String.valueOf(getModificationRequestId());
	}
	
}
