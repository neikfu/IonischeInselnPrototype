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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Restaurant")
public class Restaurant extends de.hhn.seb.pmt.ionische.model.MapElement implements Serializable {
	public Restaurant() {
	}
	
	@Column(name="PriceCategory", nullable=true)	
	private byte priceCategory;
	
	public void setPriceCategory(byte value) {
		this.priceCategory = value;
	}
	
	public byte getPriceCategory() {
		return priceCategory;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
