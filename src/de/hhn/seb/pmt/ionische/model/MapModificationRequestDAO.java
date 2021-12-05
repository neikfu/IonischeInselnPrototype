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

public class MapModificationRequestDAO {
	public static MapModificationRequest loadMapModificationRequestByORMID(int modificationRequestId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapModificationRequestByORMID(session, modificationRequestId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest getMapModificationRequestByORMID(int modificationRequestId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getMapModificationRequestByORMID(session, modificationRequestId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest loadMapModificationRequestByORMID(int modificationRequestId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapModificationRequestByORMID(session, modificationRequestId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest getMapModificationRequestByORMID(int modificationRequestId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getMapModificationRequestByORMID(session, modificationRequestId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest loadMapModificationRequestByORMID(PersistentSession session, int modificationRequestId) throws PersistentException {
		try {
			return (MapModificationRequest) session.load(de.hhn.seb.pmt.ionische.model.MapModificationRequest.class, Integer.valueOf(modificationRequestId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest getMapModificationRequestByORMID(PersistentSession session, int modificationRequestId) throws PersistentException {
		try {
			return (MapModificationRequest) session.get(de.hhn.seb.pmt.ionische.model.MapModificationRequest.class, Integer.valueOf(modificationRequestId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest loadMapModificationRequestByORMID(PersistentSession session, int modificationRequestId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MapModificationRequest) session.load(de.hhn.seb.pmt.ionische.model.MapModificationRequest.class, Integer.valueOf(modificationRequestId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest getMapModificationRequestByORMID(PersistentSession session, int modificationRequestId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MapModificationRequest) session.get(de.hhn.seb.pmt.ionische.model.MapModificationRequest.class, Integer.valueOf(modificationRequestId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMapModificationRequest(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryMapModificationRequest(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMapModificationRequest(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryMapModificationRequest(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest[] listMapModificationRequestByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listMapModificationRequestByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest[] listMapModificationRequestByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listMapModificationRequestByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMapModificationRequest(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapModificationRequest as MapModificationRequest");
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
	
	public static List queryMapModificationRequest(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapModificationRequest as MapModificationRequest");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MapModificationRequest", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest[] listMapModificationRequestByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMapModificationRequest(session, condition, orderBy);
			return (MapModificationRequest[]) list.toArray(new MapModificationRequest[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest[] listMapModificationRequestByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMapModificationRequest(session, condition, orderBy, lockMode);
			return (MapModificationRequest[]) list.toArray(new MapModificationRequest[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest loadMapModificationRequestByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapModificationRequestByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest loadMapModificationRequestByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadMapModificationRequestByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest loadMapModificationRequestByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MapModificationRequest[] mapModificationRequests = listMapModificationRequestByQuery(session, condition, orderBy);
		if (mapModificationRequests != null && mapModificationRequests.length > 0)
			return mapModificationRequests[0];
		else
			return null;
	}
	
	public static MapModificationRequest loadMapModificationRequestByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MapModificationRequest[] mapModificationRequests = listMapModificationRequestByQuery(session, condition, orderBy, lockMode);
		if (mapModificationRequests != null && mapModificationRequests.length > 0)
			return mapModificationRequests[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMapModificationRequestByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateMapModificationRequestByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMapModificationRequestByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateMapModificationRequestByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMapModificationRequestByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapModificationRequest as MapModificationRequest");
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
	
	public static java.util.Iterator iterateMapModificationRequestByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.MapModificationRequest as MapModificationRequest");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MapModificationRequest", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MapModificationRequest createMapModificationRequest() {
		return new de.hhn.seb.pmt.ionische.model.MapModificationRequest();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.MapModificationRequest mapModificationRequest) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(mapModificationRequest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.MapModificationRequest mapModificationRequest) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(mapModificationRequest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.MapModificationRequest mapModificationRequest)throws PersistentException {
		try {
			if (mapModificationRequest.getRegisteredUser() != null) {
				mapModificationRequest.getRegisteredUser().mapModificatioRequest.remove(mapModificationRequest);
			}
			
			if (mapModificationRequest.getRequestedElement() != null) {
				mapModificationRequest.getRequestedElement().mapModificationRequests.remove(mapModificationRequest);
			}
			
			return delete(mapModificationRequest);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.MapModificationRequest mapModificationRequest, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (mapModificationRequest.getRegisteredUser() != null) {
				mapModificationRequest.getRegisteredUser().mapModificatioRequest.remove(mapModificationRequest);
			}
			
			if (mapModificationRequest.getRequestedElement() != null) {
				mapModificationRequest.getRequestedElement().mapModificationRequests.remove(mapModificationRequest);
			}
			
			try {
				session.delete(mapModificationRequest);
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
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.MapModificationRequest mapModificationRequest) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(mapModificationRequest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.MapModificationRequest mapModificationRequest) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(mapModificationRequest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
