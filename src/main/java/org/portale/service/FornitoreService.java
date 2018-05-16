package org.portale.service;

import java.util.List;
import org.portale.model.Fornitore;

public interface FornitoreService {
	public void addFornitore(Fornitore fornitore);
	public void updateFornitore(Fornitore fornitore);
	public List<Fornitore> listaFornitori();
	public Fornitore getFornitoreById(int id);
	public void removeFornitore(int id);
	
}
