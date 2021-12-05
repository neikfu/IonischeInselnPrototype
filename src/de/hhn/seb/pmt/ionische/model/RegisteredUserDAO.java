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

public class RegisteredUserDAO {
	public static RegisteredUser loadRegisteredUserByORMID(int userId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadRegisteredUserByORMID(session, userId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser getRegisteredUserByORMID(int userId) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getRegisteredUserByORMID(session, userId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser loadRegisteredUserByORMID(int userId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadRegisteredUserByORMID(session, userId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser getRegisteredUserByORMID(int userId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getRegisteredUserByORMID(session, userId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser loadRegisteredUserByORMID(PersistentSession session, int userId) throws PersistentException {
		try {
			return (RegisteredUser) session.load(de.hhn.seb.pmt.ionische.model.RegisteredUser.class, Integer.valueOf(userId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser getRegisteredUserByORMID(PersistentSession session, int userId) throws PersistentException {
		try {
			return (RegisteredUser) session.get(de.hhn.seb.pmt.ionische.model.RegisteredUser.class, Integer.valueOf(userId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser loadRegisteredUserByORMID(PersistentSession session, int userId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RegisteredUser) session.load(de.hhn.seb.pmt.ionische.model.RegisteredUser.class, Integer.valueOf(userId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser getRegisteredUserByORMID(PersistentSession session, int userId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RegisteredUser) session.get(de.hhn.seb.pmt.ionische.model.RegisteredUser.class, Integer.valueOf(userId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegisteredUser(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryRegisteredUser(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegisteredUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryRegisteredUser(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser[] listRegisteredUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listRegisteredUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser[] listRegisteredUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listRegisteredUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegisteredUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.RegisteredUser as RegisteredUser");
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
	
	public static List queryRegisteredUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.RegisteredUser as RegisteredUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RegisteredUser", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser[] listRegisteredUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRegisteredUser(session, condition, orderBy);
			return (RegisteredUser[]) list.toArray(new RegisteredUser[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser[] listRegisteredUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRegisteredUser(session, condition, orderBy, lockMode);
			return (RegisteredUser[]) list.toArray(new RegisteredUser[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser loadRegisteredUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadRegisteredUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser loadRegisteredUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadRegisteredUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser loadRegisteredUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		RegisteredUser[] registeredUsers = listRegisteredUserByQuery(session, condition, orderBy);
		if (registeredUsers != null && registeredUsers.length > 0)
			return registeredUsers[0];
		else
			return null;
	}
	
	public static RegisteredUser loadRegisteredUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		RegisteredUser[] registeredUsers = listRegisteredUserByQuery(session, condition, orderBy, lockMode);
		if (registeredUsers != null && registeredUsers.length > 0)
			return registeredUsers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRegisteredUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateRegisteredUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegisteredUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateRegisteredUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegisteredUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.RegisteredUser as RegisteredUser");
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
	
	public static java.util.Iterator iterateRegisteredUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.RegisteredUser as RegisteredUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RegisteredUser", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegisteredUser createRegisteredUser() {
		return new de.hhn.seb.pmt.ionische.model.RegisteredUser();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(registeredUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(registeredUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = registeredUser.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setRegisteredUser(null);
			}
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificatioRequests = registeredUser.mapModificatioRequest.toArray();
			for(int i = 0; i < lMapModificatioRequests.length; i++) {
				lMapModificatioRequests[i].setRegisteredUser(null);
			}
			de.hhn.seb.pmt.ionische.model.DangerousEntity[] lDangerousEntitiess = registeredUser.dangerousEntities.toArray();
			for(int i = 0; i < lDangerousEntitiess.length; i++) {
				lDangerousEntitiess[i].registeredUsers.remove(registeredUser);
			}
			de.hhn.seb.pmt.ionische.model.PublicService[] lPublicServices = registeredUser.publicService.toArray();
			for(int i = 0; i < lPublicServices.length; i++) {
				lPublicServices[i].setRegisteredUser(null);
			}
			return delete(registeredUser);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.Review[] lReviewss = registeredUser.reviews.toArray();
			for(int i = 0; i < lReviewss.length; i++) {
				lReviewss[i].setRegisteredUser(null);
			}
			de.hhn.seb.pmt.ionische.model.MapModificationRequest[] lMapModificatioRequests = registeredUser.mapModificatioRequest.toArray();
			for(int i = 0; i < lMapModificatioRequests.length; i++) {
				lMapModificatioRequests[i].setRegisteredUser(null);
			}
			de.hhn.seb.pmt.ionische.model.DangerousEntity[] lDangerousEntitiess = registeredUser.dangerousEntities.toArray();
			for(int i = 0; i < lDangerousEntitiess.length; i++) {
				lDangerousEntitiess[i].registeredUsers.remove(registeredUser);
			}
			de.hhn.seb.pmt.ionische.model.PublicService[] lPublicServices = registeredUser.publicService.toArray();
			for(int i = 0; i < lPublicServices.length; i++) {
				lPublicServices[i].setRegisteredUser(null);
			}
			try {
				session.delete(registeredUser);
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
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(registeredUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.RegisteredUser registeredUser) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(registeredUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
