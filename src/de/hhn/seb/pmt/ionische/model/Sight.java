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
@DiscriminatorValue("Sight")
public class Sight extends de.hhn.seb.pmt.ionische.model.MapElement implements Serializable {
	public Sight() {
	}
	
	@Column(name="RegularPrice", nullable=true)	
	private double regularPrice;
	
	@Column(name="ChildrenPrice", nullable=true)	
	private double childrenPrice;
	
	@Column(name="StudentPrice", nullable=true)	
	private double studentPrice;
	
	public void setRegularPrice(double value) {
		this.regularPrice = value;
	}
	
	public double getRegularPrice() {
		return regularPrice;
	}
	
	public void setChildrenPrice(double value) {
		this.childrenPrice = value;
	}
	
	public double getChildrenPrice() {
		return childrenPrice;
	}
	
	public void setStudentPrice(double value) {
		this.studentPrice = value;
	}
	
	public double getStudentPrice() {
		return studentPrice;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
