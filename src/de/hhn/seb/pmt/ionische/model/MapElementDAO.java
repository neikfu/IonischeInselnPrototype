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

public class MapElementDAO {
	public static MapElement loadMapElementByORMID(int elementId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapElementByORMID(session, elementId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement getMapElementByORMID(int elementId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getMapElementByORMID(session, elementId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement loadMapElementByORMID(int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapElementByORMID(session, elementId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement getMapElementByORMID(int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getMapElementByORMID(session, elementId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement loadMapElementByORMID(PersistentSession session, int elementId) throws PersistentException {
		try {
			return (MapElement) session.load(de.hhn.seb.pmt.ionische.model.MapElement.class, Integer.valueOf(elementId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement getMapElementByORMID(PersistentSession session, int elementId) throws PersistentException {
		try {
			return (MapElement) session.get(de.hhn.seb.pmt.ionische.model.MapElement.class, Integer.valueOf(elementId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement loadMapElementByORMID(PersistentSession session, int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MapElement) session.load(de.hhn.seb.pmt.ionische.model.MapElement.class, Integer.valueOf(elementId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement getMapElementByORMID(PersistentSession session, int elementId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MapElement) session.get(de.hhn.seb.pmt.ionische.model.MapElement.class, Integer.valueOf(elementId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMapElement(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryMapElement(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMapElement(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryMapElement(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement[] listMapElementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listMapElementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement[] listMapElementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listMapElementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMapElement(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapElement as MapElement");
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
	
	public static List queryMapElement(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapElement as MapElement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MapElement", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement[] listMapElementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMapElement(session, condition, orderBy);
			return (MapElement[]) list.toArray(new MapElement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement[] listMapElementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMapElement(session, condition, orderBy, lockMode);
			return (MapElement[]) list.toArray(new MapElement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement loadMapElementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapElementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement loadMapElementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapElementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement loadMapElementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MapElement[] mapElements = listMapElementByQuery(session, condition, orderBy);
		if (mapElements != null && mapElements.length > 0)
			return mapElements[0];
		else
			return null;
	}
	
	public static MapElement loadMapElementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MapElement[] mapElements = listMapElementByQuery(session, condition, orderBy, lockMode);
		if (mapElements != null && mapElements.length > 0)
			return mapElements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMapElementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateMapElementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMapElementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateMapElementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMapElementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapElement as MapElement");
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
	
	public static java.util.Iterator iterateMapElementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapElement as MapElement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MapElement", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapElement createMapElement() {
		return new de.hhn.seb.pmt.ionische.model.MapElement();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.MapElement mapElement) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(mapElement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.MapElement mapElement) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(mapElement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.MapElement mapElement)throws PersistentException {
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.Sight) {
			return de.hhn.seb.pmt.ionische.model.SightDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.Sight) mapElement);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.Restaurant) {
			return de.hhn.seb.pmt.ionische.model.RestaurantDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.Restaurant) mapElement);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.BoatGasStation) {
			return de.hhn.seb.pmt.ionische.model.BoatGasStationDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.BoatGasStation) mapElement);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.Store) {
			return de.hhn.seb.pmt.ionische.model.StoreDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.Store) mapElement);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.BoatMooringSpot) {
			return de.hhn.seb.pmt.ionische.model.BoatMooringSpotDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.BoatMooringSpot) mapElement);
		}
		
		try {
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificationRequestss = mapElement.mapModificationRequests.toArray();
			for(int i = 0; i < lMapModificationRequestss.length; i++) {
				lMapModificationRequestss[i].setRequestedElement(null);
			}
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = mapElement.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setReviewedElement(null);
			}
			return delete(mapElement);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.MapElement mapElement, org.orm.PersistentSession session)throws PersistentException {
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.Sight) {
			return de.hhn.seb.pmt.ionische.model.SightDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.Sight) mapElement, session);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.Restaurant) {
			return de.hhn.seb.pmt.ionische.model.RestaurantDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.Restaurant) mapElement, session);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.BoatGasStation) {
			return de.hhn.seb.pmt.ionische.model.BoatGasStationDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.BoatGasStation) mapElement, session);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.Store) {
			return de.hhn.seb.pmt.ionische.model.StoreDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.Store) mapElement, session);
		}
		
		if (mapElement instanceof de.hhn.seb.pmt.ionische.model.BoatMooringSpot) {
			return de.hhn.seb.pmt.ionische.model.BoatMooringSpotDAO.deleteAndDissociate((de.hhn.seb.pmt.ionische.model.BoatMooringSpot) mapElement, session);
		}
		
		try {
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificationRequestss = mapElement.mapModificationRequests.toArray();
			for(int i = 0; i < lMapModificationRequestss.length; i++) {
				lMapModificationRequestss[i].setRequestedElement(null);
			}
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = mapElement.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setReviewedElement(null);
			}
			try {
				session.delete(mapElement);
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
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.MapElement mapElement) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(mapElement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.MapElement mapElement) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(mapElement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
