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

public class DangerousEntityDAO {
	public static DangerousEntity loadDangerousEntityByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadDangerousEntityByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity getDangerousEntityByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getDangerousEntityByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity loadDangerousEntityByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadDangerousEntityByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity getDangerousEntityByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return getDangerousEntityByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity loadDangerousEntityByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (DangerousEntity) session.load(de.hhn.seb.pmt.ionische.model.DangerousEntity.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity getDangerousEntityByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (DangerousEntity) session.get(de.hhn.seb.pmt.ionische.model.DangerousEntity.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity loadDangerousEntityByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DangerousEntity) session.load(de.hhn.seb.pmt.ionische.model.DangerousEntity.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity getDangerousEntityByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DangerousEntity) session.get(de.hhn.seb.pmt.ionische.model.DangerousEntity.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDangerousEntity(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryDangerousEntity(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDangerousEntity(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return queryDangerousEntity(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity[] listDangerousEntityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listDangerousEntityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity[] listDangerousEntityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return listDangerousEntityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDangerousEntity(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.DangerousEntity as DangerousEntity");
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
	
	public static List queryDangerousEntity(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.DangerousEntity as DangerousEntity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DangerousEntity", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity[] listDangerousEntityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDangerousEntity(session, condition, orderBy);
			return (DangerousEntity[]) list.toArray(new DangerousEntity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity[] listDangerousEntityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDangerousEntity(session, condition, orderBy, lockMode);
			return (DangerousEntity[]) list.toArray(new DangerousEntity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity loadDangerousEntityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadDangerousEntityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity loadDangerousEntityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return loadDangerousEntityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity loadDangerousEntityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DangerousEntity[] dangerousEntitys = listDangerousEntityByQuery(session, condition, orderBy);
		if (dangerousEntitys != null && dangerousEntitys.length > 0)
			return dangerousEntitys[0];
		else
			return null;
	}
	
	public static DangerousEntity loadDangerousEntityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DangerousEntity[] dangerousEntitys = listDangerousEntityByQuery(session, condition, orderBy, lockMode);
		if (dangerousEntitys != null && dangerousEntitys.length > 0)
			return dangerousEntitys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDangerousEntityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateDangerousEntityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDangerousEntityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PMTGruppeHIonischeInselnPersistentManager.instance().getSession();
			return iterateDangerousEntityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDangerousEntityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.DangerousEntity as DangerousEntity");
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
	
	public static java.util.Iterator iterateDangerousEntityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.seb.pmt.ionische.model.DangerousEntity as DangerousEntity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DangerousEntity", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DangerousEntity createDangerousEntity() {
		return new de.hhn.seb.pmt.ionische.model.DangerousEntity();
	}
	
	public static boolean save(de.hhn.seb.pmt.ionische.model.DangerousEntity dangerousEntity) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().saveObject(dangerousEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.seb.pmt.ionische.model.DangerousEntity dangerousEntity) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().deleteObject(dangerousEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.DangerousEntity dangerousEntity)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.RegisteredUser[] lRegisteredUserss = dangerousEntity.registeredUsers.toArray();
			for(int i = 0; i < lRegisteredUserss.length; i++) {
				lRegisteredUserss[i].dangerousEntities.remove(dangerousEntity);
			}
			return delete(dangerousEntity);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.seb.pmt.ionische.model.DangerousEntity dangerousEntity, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.seb.pmt.ionische.model.RegisteredUser[] lRegisteredUserss = dangerousEntity.registeredUsers.toArray();
			for(int i = 0; i < lRegisteredUserss.length; i++) {
				lRegisteredUserss[i].dangerousEntities.remove(dangerousEntity);
			}
			try {
				session.delete(dangerousEntity);
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
	
	public static boolean refresh(de.hhn.seb.pmt.ionische.model.DangerousEntity dangerousEntity) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().refresh(dangerousEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.seb.pmt.ionische.model.DangerousEntity dangerousEntity) throws PersistentException {
		try {
			PMTGruppeHIonischeInselnPersistentManager.instance().getSession().evict(dangerousEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
