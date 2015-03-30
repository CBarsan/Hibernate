package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import metier.Service;

public class ServiceManager {

	// attribut
	static SessionFactory sessionFactory = new Configuration().configure()
			.buildSessionFactory();

	// constructeur sans argument

	public Service save(Service service) {

		// TODO Auto-generated method stub
		Service serviceSauve = null;
		Session s = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			s.save(service);
			tx.commit();
			serviceSauve = service;

		} catch (Exception e) {
			// TODO: handle exception
			if (tx != null)
				tx.rollback();
			// throw e;
			e.printStackTrace();
		} finally {
			s.close();
		}
		return serviceSauve;

	}

	public static Service serviceGet(int id) {

		// TODO Auto-generated method stub
		Service serviceGet = null;
		Session s = sessionFactory.openSession();
		try {
			serviceGet = (Service) s.get(Service.class, id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			s.close();
			sessionFactory.close();
		}
		return serviceGet;

	}
}
