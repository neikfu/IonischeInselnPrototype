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

public class PublicServiceDAO {
	public static PublicService loadPublicServiceByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadPublicServiceByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService getPublicServiceByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getPublicServiceByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService loadPublicServiceByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadPublicServiceByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService getPublicServiceByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getPublicServiceByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService loadPublicServiceByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (PublicService) session.load(de.hhn.seb.pmt.ionische.model.PublicService.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService getPublicServiceByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (PublicService) session.get(de.hhn.seb.pmt.ionische.model.PublicService.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService loadPublicServiceByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PublicService) session.load(de.hhn.seb.pmt.ionische.model.PublicService.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService getPublicServiceByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PublicService) session.get(de.hhn.seb.pmt.ionische.model.PublicService.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicService(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryPublicService(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicService(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryPublicService(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService[] listPublicServiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listPublicServiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService[] listPublicServiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listPublicServiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicService(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.PublicService as PublicService");
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
	
	public static List queryPublicService(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.PublicService as PublicService");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PublicService", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService[] listPublicServiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublicService(session, condition, orderBy);
			return (PublicService[]) list.toArray(new PublicService[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService[] listPublicServiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublicService(session, condition, orderBy, lockMode);
			return (PublicService[]) list.toArray(new PublicService[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService loadPublicServiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadPublicServiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService loadPublicServiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadPublicServiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService loadPublicServiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PublicService[] publicServices = listPublicServiceByQuery(session, condition, orderBy);
		if (publicServices != null && publicServices.length > 0)
			return publicServices[0];
		else
			return null;
	}
	
	public static PublicService loadPublicServiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PublicService[] publicServices = listPublicServiceByQuery(session, condition, orderBy, lockMode);
		if (publicServices != null && publicServices.length > 0)
			return publicServices[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePublicServiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iteratePublicServiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicServiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iteratePublicServiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicServiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.PublicService as PublicService");
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
	
	public static java.util.Iterator iteratePublicServiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.PublicService as PublicService");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PublicService", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicService createPublicService() {
		return new de.hhn.seb.pmt.ionische.model.PublicService();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.PublicService publicService) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(publicService);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.PublicService publicService) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(publicService);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.PublicService publicService)throws PersistentException {
		try {
			if (publicService.getRegisteredUser() != null) {
				publicService.getRegisteredUser().publicService.remove(publicService);
			}
			
			return delete(publicService);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.PublicService publicService, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (publicService.getRegisteredUser() != null) {
				publicService.getRegisteredUser().publicService.remove(publicService);
			}
			
			try {
				session.delete(publicService);
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
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.PublicService publicService) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(publicService);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.PublicService publicService) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(publicService);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
