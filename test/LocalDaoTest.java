//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

import pojo.Local;
import dao.LocalDao;

public class LocalDaoTest {

	@Test  //esse metodo faz teste. PagJunit javadoc
	public void incluir() {
		Local local = new Local();
		LocalDao dao = new LocalDao();
		dao.incluir(local);
		
		assertNotEquals("Não foi inserido", local.getId(), 0);
		/*o mesmo que o abaixo
		if (local.getId() == 0 ) {
			//da erro
			
		} */
	}
	
	@Test
	public void consultar() {
		Local local = new Local();
		LocalDao dao = new LocalDao();
		dao.incluir(local);
		assertNotEquals("Não foi inserido", local.getId(), 0);
		
		int id = local.getId();
		Local localConsulta = dao.consultarPorId(local.getId()); //variavel localConsulta armazena a id consultada (local.getId())
		assertSame("Consulta falhou", local, localConsulta); //objeto 'local' compara com o número localConsulta
	}
	
}
