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
@Table(name="RegisteredUser")
public class RegisteredUser implements Serializable {
	public RegisteredUser() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_REGISTEREDUSER_REVIEWS) {
			return ORM_reviews;
		}
		else if (key == ORMConstants.KEY_REGISTEREDUSER_MAPMODIFICATIOREQUEST) {
			return ORM_mapModificatioRequest;
		}
		else if (key == ORMConstants.KEY_REGISTEREDUSER_DANGEROUSENTITIES) {
			return ORM_dangerousEntities;
		}
		else if (key == ORMConstants.KEY_REGISTEREDUSER_PUBLICSERVICE) {
			return ORM_publicService;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="UserId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SEB_PMT_IONISCHE_MODEL_REGISTEREDUSER_USERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SEB_PMT_IONISCHE_MODEL_REGISTEREDUSER_USERID_GENERATOR", strategy="native")	
	private int userId;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="IsAdmin", nullable=false, length=1)	
	private boolean isAdmin;
	
	@Column(name="Username", nullable=true, length=255)	
	private String username;
	
	@OneToMany(mappedBy="registeredUser", targetEntity=de.hhn.seb.pmt.ionische.model.Review.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reviews = new java.util.HashSet();
	
	@OneToMany(mappedBy="registeredUser", targetEntity=de.hhn.seb.pmt.ionische.model.MapModificationRequest.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mapModificatioRequest = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_registeredUsers", targetEntity=de.hhn.seb.pmt.ionische.model.DangerousEntity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_dangerousEntities = new java.util.HashSet();
	
	@OneToMany(mappedBy="registeredUser", targetEntity=de.hhn.seb.pmt.ionische.model.PublicService.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publicService = new java.util.HashSet();
	
	private void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getORMID() {
		return getUserId();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setIsAdmin(boolean value) {
		this.isAdmin = value;
	}
	
	public boolean getIsAdmin() {
		return isAdmin;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	private void setORM_Reviews(java.util.Set value) {
		this.ORM_reviews = value;
	}
	
	private java.util.Set getORM_Reviews() {
		return ORM_reviews;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.ReviewSetCollection reviews = new de.hhn.seb.pmt.ionische.model.ReviewSetCollection(this, _ormAdapter, ORMConstants.KEY_REGISTEREDUSER_REVIEWS, ORMConstants.KEY_REVIEW_REGISTEREDUSER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_MapModificatioRequest(java.util.Set value) {
		this.ORM_mapModificatioRequest = value;
	}
	
	private java.util.Set getORM_MapModificatioRequest() {
		return ORM_mapModificatioRequest;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.MapModificationRequestSetCollection mapModificatioRequest = new de.hhn.seb.pmt.ionische.model.MapModificationRequestSetCollection(this, _ormAdapter, ORMConstants.KEY_REGISTEREDUSER_MAPMODIFICATIOREQUEST, ORMConstants.KEY_MAPMODIFICATIONREQUEST_REGISTEREDUSER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_DangerousEntities(java.util.Set value) {
		this.ORM_dangerousEntities = value;
	}
	
	private java.util.Set getORM_DangerousEntities() {
		return ORM_dangerousEntities;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.DangerousEntitySetCollection dangerousEntities = new de.hhn.seb.pmt.ionische.model.DangerousEntitySetCollection(this, _ormAdapter, ORMConstants.KEY_REGISTEREDUSER_DANGEROUSENTITIES, ORMConstants.KEY_DANGEROUSENTITY_REGISTEREDUSERS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_PublicService(java.util.Set value) {
		this.ORM_publicService = value;
	}
	
	private java.util.Set getORM_PublicService() {
		return ORM_publicService;
	}
	
	@Transient	
	public final de.hhn.seb.pmt.ionische.model.PublicServiceSetCollection publicService = new de.hhn.seb.pmt.ionische.model.PublicServiceSetCollection(this, _ormAdapter, ORMConstants.KEY_REGISTEREDUSER_PUBLICSERVICE, ORMConstants.KEY_PUBLICSERVICE_REGISTEREDUSER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUserId());
	}
	
}
