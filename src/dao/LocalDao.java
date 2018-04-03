package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.Local;

public class LocalDao {

	private List<Local> locais;
	
	public LocalDao() {
		this.locais = new ArrayList<>();		
	}
	
	public void incluir(Local local) {
		//TODO: implementar
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