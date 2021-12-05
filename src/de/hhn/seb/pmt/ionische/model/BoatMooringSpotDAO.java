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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class BoatMooringSpotDAO {
	public static BoatMooringSpot loadBoatMooringSpotByORMID(int elementId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatMooringSpotByORMID(session, elementId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot getBoatMooringSpotByORMID(int elementId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getBoatMooringSpotByORMID(session, elementId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByORMID(int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatMooringSpotByORMID(session, elementId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot getBoatMooringSpotByORMID(int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getBoatMooringSpotByORMID(session, elementId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByORMID(PersistentSession session, int elementId) throws PersistentException {
		try {
			return (BoatMooringSpot) session.load(de.hhn.seb.pmt.ionische.model.BoatMooringSpot.class, Integer.valueOf(elementId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot getBoatMooringSpotByORMID(PersistentSession session, int elementId) throws PersistentException {
		try {
			return (BoatMooringSpot) session.get(de.hhn.seb.pmt.ionische.model.BoatMooringSpot.class, Integer.valueOf(elementId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByORMID(PersistentSession session, int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (BoatMooringSpot) session.load(de.hhn.seb.pmt.ionische.model.BoatMooringSpot.class, Integer.valueOf(elementId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot getBoatMooringSpotByORMID(PersistentSession session, int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (BoatMooringSpot) session.get(de.hhn.seb.pmt.ionische.model.BoatMooringSpot.class, Integer.valueOf(elementId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatMooringSpot(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryBoatMooringSpot(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatMooringSpot(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryBoatMooringSpot(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot[] listBoatMooringSpotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listBoatMooringSpotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot[] listBoatMooringSpotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listBoatMooringSpotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatMooringSpot(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatMooringSpot as BoatMooringSpot");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatMooringSpot(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatMooringSpot as BoatMooringSpot");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("BoatMooringSpot", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot[] listBoatMooringSpotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBoatMooringSpot(session, condition, orderBy);
			return (BoatMooringSpot[]) list.toArray(new BoatMooringSpot[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot[] listBoatMooringSpotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBoatMooringSpot(session, condition, orderBy, lockMode);
			return (BoatMooringSpot[]) list.toArray(new BoatMooringSpot[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatMooringSpotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatMooringSpotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		BoatMooringSpot[] boatMooringSpots = listBoatMooringSpotByQuery(session, condition, orderBy);
		if (boatMooringSpots != null && boatMooringSpots.length > 0)
			return boatMooringSpots[0];
		else
			return null;
	}
	
	public static BoatMooringSpot loadBoatMooringSpotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		BoatMooringSpot[] boatMooringSpots = listBoatMooringSpotByQuery(session, condition, orderBy, lockMode);
		if (boatMooringSpots != null && boatMooringSpots.length > 0)
			return boatMooringSpots[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBoatMooringSpotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateBoatMooringSpotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoatMooringSpotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateBoatMooringSpotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoatMooringSpotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatMooringSpot as BoatMooringSpot");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoatMooringSpotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatMooringSpot as BoatMooringSpot");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("BoatMooringSpot", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatMooringSpot createBoatMooringSpot() {
		return new de.hhn.seb.pmt.ionische.model.BoatMooringSpot();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.BoatMooringSpot boatMooringSpot) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(boatMooringSpot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.BoatMooringSpot boatMooringSpot) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(boatMooringSpot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.BoatMooringSpot boatMooringSpot)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificationRequestss = boatMooringSpot.mapModificationRequests.toArray();
			for(int i = 0; i < lMapModificationRequestss.length; i++) {
				lMapModificationRequestss[i].setRequestedElement(null);
			}
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = boatMooringSpot.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setReviewedElement(null);
			}
			return delete(boatMooringSpot);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.BoatMooringSpot boatMooringSpot, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificationRequestss = boatMooringSpot.mapModificationRequests.toArray();
			for(int i = 0; i < lMapModificationRequestss.length; i++) {
				lMapModificationRequestss[i].setRequestedElement(null);
			}
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = boatMooringSpot.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setReviewedElement(null);
			}
			try {
				session.delete(boatMooringSpot);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.BoatMooringSpot boatMooringSpot) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(boatMooringSpot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.BoatMooringSpot boatMooringSpot) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(boatMooringSpot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
