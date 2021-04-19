package br.com.camadas.bo;

import br.com.camadas.dao.CarroDAO;
import br.com.camadas.modelo.Carro;

public class CarroBO {
	
	
	public static String apagarCarro(String modelo) {
		if (modelo.length() < 2) {
			return "Modelo não encontrado";
		}
		return new CarroDAO().deleteCarro(modelo.toUpperCase());
	}
	
	public static Carro pesquisarModelo(String modelo) {
		if( modelo.length()<2) {
			return new Carro();
		}
		return new CarroDAO().getCarro(modelo.toUpperCase());
	}
	
	public static String exibirCarros() {
		//CarroDAO dao = new CarroDAO();
		//return dao.exibirTudo();
		//Essas duas linhas ^ faz exatamente a mesma coisa da linha abaixo:
		return new CarroDAO().exibirTudo();
	}
	
	public static boolean novo(Carro objeto) {
		if (objeto.getAno()<1970) {
		return false;
		}
		
		if (objeto.getAno()<=0) {
			return false;
		}
		
		objeto.setModelo(objeto.getModelo().toUpperCase());
		objeto.setCor(objeto.getCor().toUpperCase());
		
		CarroDAO dao = new CarroDAO();
		dao.gravar(objeto);
		return true;
		
	}

}
