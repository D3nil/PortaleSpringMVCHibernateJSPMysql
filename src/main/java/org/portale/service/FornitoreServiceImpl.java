package org.portale.service;

import java.util.List;

import org.portale.dao.FornitoreDAO;
import org.portale.model.Fornitore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FornitoreServiceImpl implements FornitoreService {

	private FornitoreDAO fornitoreDAO;

	
	public void setFornitoreDAO(FornitoreDAO fornitoreDAO) {
		this.fornitoreDAO = fornitoreDAO;
	}

	@Transactional
	@Override
	public void addFornitore(Fornitore fornitore) {
		this.fornitoreDAO.addFornitore(fornitore);
	}

	@Transactional
	@Override
	public void updateFornitore(Fornitore fornitore) {
		this.fornitoreDAO.updateFornitore(fornitore);
	}

	@Transactional
	@Override
	public List<Fornitore> listaFornitori() {
		return this.fornitoreDAO.listaFornitori();
	}

	@Transactional
	@Override
	public Fornitore getFornitoreById(Long id) 
	{
		return this.fornitoreDAO.getFornitoreById(id);
	}

	@Transactional
	@Override
	public void removeFornitore(int id) {
		this.fornitoreDAO.removeFornitore(id);
	}
	
	@Override
	public boolean validateFornitore(String p_iva, String passw) 
	{
		return this.fornitoreDAO.validateFornitore(p_iva, passw);
		
	};

}
