package br.com.camadas.interfaces;

public interface PadraoDAO<T> {

	public boolean gravar(T objeto);
	public String exibirTudo();

}
