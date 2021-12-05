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
@DiscriminatorValue("BoatGasStation")
public class BoatGasStation extends de.hhn.seb.pmt.ionische.model.MapElement implements Serializable {
	public BoatGasStation() {
	}
	
	@Column(name="PetrolPrice", nullable=true)	
	private double petrolPrice;
	
	@Column(name="DieselPrice", nullable=true)	
	private double dieselPrice;
	
	public void setPetrolPrice(double value) {
		this.petrolPrice = value;
	}
	
	public double getPetrolPrice() {
		return petrolPrice;
	}
	
	public void setDieselPrice(double value) {
		this.dieselPrice = value;
	}
	
	public double getDieselPrice() {
		return dieselPrice;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
