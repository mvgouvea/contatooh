package controle;


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import persistencia.VotoDao;
import entidade.Voto;

public class CtrlVoto {
	
	Voto voto;
	
	private VotoDao votoDao = new VotoDao();
	
	
	public void salvarVoto(Integer nota) {
		voto = new Voto(nota);
		votoDao.salvar(voto);
	}
	
	public boolean validarEntrada(Integer v) {
		
		try {
			if (v > 10 || v < 0)
				return false;
			else
				return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
}
