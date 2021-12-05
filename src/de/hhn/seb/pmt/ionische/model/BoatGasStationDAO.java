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

public class BoatGasStationDAO {
	public static BoatGasStation loadBoatGasStationByORMID(int elementId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatGasStationByORMID(session, elementId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation getBoatGasStationByORMID(int elementId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getBoatGasStationByORMID(session, elementId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation loadBoatGasStationByORMID(int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatGasStationByORMID(session, elementId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation getBoatGasStationByORMID(int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getBoatGasStationByORMID(session, elementId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation loadBoatGasStationByORMID(PersistentSession session, int elementId) throws PersistentException {
		try {
			return (BoatGasStation) session.load(de.hhn.seb.pmt.ionische.model.BoatGasStation.class, Integer.valueOf(elementId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation getBoatGasStationByORMID(PersistentSession session, int elementId) throws PersistentException {
		try {
			return (BoatGasStation) session.get(de.hhn.seb.pmt.ionische.model.BoatGasStation.class, Integer.valueOf(elementId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation loadBoatGasStationByORMID(PersistentSession session, int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (BoatGasStation) session.load(de.hhn.seb.pmt.ionische.model.BoatGasStation.class, Integer.valueOf(elementId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation getBoatGasStationByORMID(PersistentSession session, int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (BoatGasStation) session.get(de.hhn.seb.pmt.ionische.model.BoatGasStation.class, Integer.valueOf(elementId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatGasStation(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryBoatGasStation(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatGasStation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryBoatGasStation(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation[] listBoatGasStationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listBoatGasStationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation[] listBoatGasStationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listBoatGasStationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBoatGasStation(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatGasStation as BoatGasStation");
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
	
	public static List queryBoatGasStation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatGasStation as BoatGasStation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("BoatGasStation", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation[] listBoatGasStationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBoatGasStation(session, condition, orderBy);
			return (BoatGasStation[]) list.toArray(new BoatGasStation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation[] listBoatGasStationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBoatGasStation(session, condition, orderBy, lockMode);
			return (BoatGasStation[]) list.toArray(new BoatGasStation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation loadBoatGasStationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatGasStationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation loadBoatGasStationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadBoatGasStationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation loadBoatGasStationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		BoatGasStation[] boatGasStations = listBoatGasStationByQuery(session, condition, orderBy);
		if (boatGasStations != null && boatGasStations.length > 0)
			return boatGasStations[0];
		else
			return null;
	}
	
	public static BoatGasStation loadBoatGasStationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		BoatGasStation[] boatGasStations = listBoatGasStationByQuery(session, condition, orderBy, lockMode);
		if (boatGasStations != null && boatGasStations.length > 0)
			return boatGasStations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBoatGasStationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateBoatGasStationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoatGasStationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateBoatGasStationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoatGasStationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatGasStation as BoatGasStation");
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
	
	public static java.util.Iterator iterateBoatGasStationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.BoatGasStation as BoatGasStation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("BoatGasStation", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static BoatGasStation createBoatGasStation() {
		return new de.hhn.seb.pmt.ionische.model.BoatGasStation();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.BoatGasStation boatGasStation) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(boatGasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.BoatGasStation boatGasStation) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(boatGasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.BoatGasStation boatGasStation)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificationRequestss = boatGasStation.mapModificationRequests.toArray();
			for(int i = 0; i < lMapModificationRequestss.length; i++) {
				lMapModificationRequestss[i].setRequestedElement(null);
			}
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = boatGasStation.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setReviewedElement(null);
			}
			return delete(boatGasStation);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.BoatGasStation boatGasStation, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificationRequestss = boatGasStation.mapModificationRequests.toArray();
			for(int i = 0; i < lMapModificationRequestss.length; i++) {
				lMapModificationRequestss[i].setRequestedElement(null);
			}
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = boatGasStation.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setReviewedElement(null);
			}
			try {
				session.delete(boatGasStation);
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
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.BoatGasStation boatGasStation) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(boatGasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.BoatGasStation boatGasStation) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(boatGasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
