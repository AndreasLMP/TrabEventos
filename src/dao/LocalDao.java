package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pojo.Local;

public class LocalDao {

	private List<Local> locais;
	private Logger LOGGER = Logger.getLogger(LocalDao.class.getName());
	
	
	public LocalDao() {
		this.locais = new ArrayList<>();		
	}
	
	public void incluir(Local local) {
		//TODO: implementar
		LOGGER.severe("Inclus�o de local: "+local);
		LOGGER.warning("Inclus�o de local: "+local);
		LOGGER.info("Inclus�o de local: "+local);
		LOGGER.fine("Inclus�o de local: "+local);
		}
	
	public void remover(Local local) {
		//TODO: implementar
	}
	
	public void atualizar(Local local) {
		//TODO: implementar
	}
	
	public Local consultar(int id) {
		return null;
	}
	
	public List listar() {
		return this.locais;
	}
	
}