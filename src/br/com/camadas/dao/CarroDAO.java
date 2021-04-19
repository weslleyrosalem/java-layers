package br.com.camadas.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.camadas.interfaces.PadraoDAO;
import br.com.camadas.modelo.Carro;

/*
 * DAO => Data Access Object é um patter que sugestiona armazenar o CRUD em uma unica classe.
 * C create, R read, U update, D delete
 * 
 */

public class CarroDAO implements PadraoDAO<Carro>{
	
	//Static no atributo: o valor fica valendo para todos os objetos
	//que foram instanciados
	private static List<Carro> carros = new ArrayList<Carro>();
	
	public String deleteCarro(String modelo) {
		for (Carro objeto: carros) {
			if (objeto.getModelo().equals(modelo)) {
				carros.remove(objeto);
				return "Removido com sucesso"; 
			}
		}
		return "Modelo não encontrado";
	}
	
	public Carro getCarro(String modelo) {
		Carro c = new Carro();
		
		for (Carro objeto: carros) {
			if (objeto.getModelo().equals(modelo)) {
				return objeto;
			}
		}
		return new Carro();
		
	}
	
	
	public boolean gravar(Carro objeto) {
		carros.add(objeto);
		return true;
	}

	//sempre retornar DADOS / metodo exibir
	public String exibirTudo() {
		return carros.toString();
	}

}
