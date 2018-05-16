package org.portale.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.portale.model.Fornitore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class FornitoreDAOImpl implements FornitoreDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(FornitoreDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addFornitore(Fornitore fornitore)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fornitore);
		logger.info("Person saved successfully, Person Details="+fornitore);
	}

	@Override
	public void updateFornitore(Fornitore fornitore) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.update(fornitore);
		logger.info("Person updated successfully, Person Details="+fornitore);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Fornitore> listaFornitori() 
	{
		Session session = this.sessionFactory.getCurrentSession();
		List<Fornitore> fornitoreList = session.createQuery("from Fornitore").list();
		for(Fornitore f : fornitoreList){
			logger.info("Fornitori Lista :: "+f);
		}
		return fornitoreList;
	}
	
	@Override
	public Fornitore getFornitoreById(Long id) 
	{
		Session session = this.sessionFactory.getCurrentSession();		
		Fornitore f = (Fornitore) session.load(Fornitore.class, new Long(id));
		logger.info("Person loaded successfully, Person details="+f);
		return f;
	}
	
	@Override
	public void removeFornitore(int id) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		Fornitore f = (Fornitore) session.load(Fornitore.class, new Integer(id));
		if(null != f)
			{	session.delete(f);  }
		logger.info("Fornitore deleted successfully, fornitore details = "+f);	
	}
	@Override
	public boolean validateFornitore(String p_iva, String passw) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		List<Fornitore> fornitoreList = session.createQuery("from Fornitore").list();
		return false;
		
	};
}
