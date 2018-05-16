package org.portale.dao;

import java.util.List;
import org.portale.model.Fornitore;

public interface FornitoreDAO 
{
	public void addFornitore(Fornitore f);
	public void updateFornitore(Fornitore f);
	public List<Fornitore> listaFornitori();
	public Fornitore getFornitoreById(int id);
	public void removeFornitore(int id);
}
