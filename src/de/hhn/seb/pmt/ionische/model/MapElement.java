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
@Table(name="MapElement")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("MapElement")
public class MapElement implements Serializable {
	public MapElement() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MAPELEMENT_MAPMODIFICATIONREQUESTS) {
			return ORM_mapModificationRequests;
		}
		else if (key == ORMConstants.KEY_MAPELEMENT_REVIEWS) {
			return ORM_reviews;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ElementId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SEB_PMT_IONISCHE_MODEL_MAPELEMENT_ELEMENTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SEB_PMT_IONISCHE_MODEL_MAPELEMENT_ELEMENTID_GENERATOR", strategy="native")	
	private int elementId;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="Latitude", nullable=false)	
	private double latitude;
	
	@Column(name="Longitude", nullable=false)	
	private double longitude;
	
	@Column(name="Picture", nullable=true, length=255)	
	private String picture;
	
	@OneToMany(mappedBy="requestedElement", targetEntity=de.hhn.seb.pmt.ionische.model.MapModificationRequest.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mapModificationRequests = new java.util.HashSet();
	
	@OneToMany(mappedBy="reviewedElement", targetEntity=de.hhn.seb.pmt.ionische.model.Review.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reviews = new java.util.HashSet();
	
	private void setElementId(int value) {
		this.elementId = value;
	}
	
	public int getElementId() {
		return elementId;
	}
	
	public int getORMID() {
		return getElementId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setLatitude(double value) {
		this.latitude = value;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double value) {
		this.longitude = value;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setPicture(String value) {
		this.picture = value;
	}
	
	public String getPicture() {
		return picture;
	}
	
	private void setORM_MapModificationRequests(java.util.Set value) {
		this.ORM_mapModificationRequests = value;
	}
	
	private java.util.Set getORM_MapModificationRequests() {
		return ORM_mapModificationRequests;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.MapModificationRequestSetCollection mapModificationRequests = new de.hhn.seb.pmt.ionische.model.MapModificationRequestSetCollection(this, _ormAdapter, ORMConstants.KEY_MAPELEMENT_MAPMODIFICATIONREQUESTS, ORMConstants.KEY_MAPMODIFICATIONREQUEST_REQUESTEDELEMENT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Reviews(java.util.Set value) {
		this.ORM_reviews = value;
	}
	
	private java.util.Set getORM_Reviews() {
		return ORM_reviews;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.ReviewSetCollection reviews = new de.hhn.seb.pmt.ionische.model.ReviewSetCollection(this, _ormAdapter, ORMConstants.KEY_MAPELEMENT_REVIEWS, ORMConstants.KEY_REVIEW_REVIEWEDELEMENT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getElementId());
	}
	
}
