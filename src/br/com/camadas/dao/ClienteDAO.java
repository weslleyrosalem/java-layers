package br.com.camadas.dao;

import br.com.camadas.interfaces.PadraoDAO;
import br.com.camadas.modelo.Cliente;

public class ClienteDAO implements PadraoDAO<Cliente>{

	@Override
	public boolean gravar(Cliente objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String exibirTudo() {
		// TODO Auto-generated method stub
		return null;
	}

}
