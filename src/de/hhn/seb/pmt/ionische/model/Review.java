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
@Table(name="Review")
public class Review implements Serializable {
	public Review() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REVIEW_REGISTEREDUSER) {
			this.registeredUser = (de.hhn.seb.pmt.ionische.model.RegisteredUser) owner;
		}
		
		else if (key == ORMConstants.KEY_REVIEW_REVIEWEDELEMENT) {
			this.reviewedElement = (de.hhn.seb.pmt.ionische.model.MapElement) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ReviewId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SEB_PMT_IONISCHE_MODEL_REVIEW_REVIEWID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SEB_PMT_IONISCHE_MODEL_REVIEW_REVIEWID_GENERATOR", strategy="native")	
	private int reviewId;
	
	@ManyToOne(targetEntity=de.hhn.seb.pmt.ionische.model.MapElement.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MapElementElementId", referencedColumnName="ElementId", nullable=false) }, foreignKey=@ForeignKey(name="values"))	
	private de.hhn.seb.pmt.ionische.model.MapElement reviewedElement;
	
	@ManyToOne(targetEntity=de.hhn.seb.pmt.ionische.model.RegisteredUser.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="RegisteredUserUserId", referencedColumnName="UserId", nullable=false) }, foreignKey=@ForeignKey(name="writes"))	
	private de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser;
	
	@Column(name="ReviewText", nullable=true, length=255)	
	private String reviewText;
	
	@Column(name="Rating", nullable=false)	
	private byte rating;
	
	@Column(name="ReviewTitle", nullable=true, length=255)	
	private String reviewTitle;
	
	private void setReviewId(int value) {
		this.reviewId = value;
	}
	
	public int getReviewId() {
		return reviewId;
	}
	
	public int getORMID() {
		return getReviewId();
	}
	
	public void setReviewText(String value) {
		this.reviewText = value;
	}
	
	public String getReviewText() {
		return reviewText;
	}
	
	public void setRating(byte value) {
		this.rating = value;
	}
	
	public byte getRating() {
		return rating;
	}
	
	public void setReviewTitle(String value) {
		this.reviewTitle = value;
	}
	
	public String getReviewTitle() {
		return reviewTitle;
	}
	
	public void setRegisteredUser(de.hhn.seb.pmt.ionische.model.RegisteredUser value) {
		if (registeredUser != null) {
			registeredUser.reviews.remove(this);
		}
		if (value != null) {
			value.reviews.add(this);
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
	
	public void setReviewedElement(de.hhn.seb.pmt.ionische.model.MapElement value) {
		if (reviewedElement != null) {
			reviewedElement.reviews.remove(this);
		}
		if (value != null) {
			value.reviews.add(this);
		}
	}
	
	public de.hhn.seb.pmt.ionische.model.MapElement getReviewedElement() {
		return reviewedElement;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ReviewedElement(de.hhn.seb.pmt.ionische.model.MapElement value) {
		this.reviewedElement = value;
	}
	
	private de.hhn.seb.pmt.ionische.model.MapElement getORM_ReviewedElement() {
		return reviewedElement;
	}
	
	public String toString() {
		return String.valueOf(getReviewId());
	}
	
}
