package br.com.camadas.implementacao;

import javax.swing.JOptionPane;

import br.com.camadas.bo.CarroBO;
import br.com.camadas.dao.CarroDAO;
import br.com.camadas.excecao.MinhaExcecao;
import br.com.camadas.lib.Magica;
import br.com.camadas.modelo.Carro;
//import sun.security.util.PropertyExpander.ExpandException;

/*MVC = MODEL VIEW CONTROLLER
 * Model = tudo menos o controller ex: lib,implementaçao
 * View = TELA PRO USUARIO - ENDPOINT) fora do Java
 * Controller = (porta de saida do back-end) onde tem o maior - no standalone
 */

public class ImplementarCarro {

	public static void main(String[] args) {
		//CarroDAO dao = new CarroDAO();
		
		try {
		while (JOptionPane.showInputDialog("Digite S").toUpperCase().equals("S")){
			Carro carro = new Carro();
			carro.setAll(
					Magica.s("Modelo"),
					Magica.f("Valor"),
					Magica.s("Cor"),
					Magica.i("Ano"));
			//dao.gravar(carro);
			//CarroBO.novo(carro);
			System.out.println(CarroBO.novo(carro));
		}
		
		//System.out.println(dao.exibirTudo());
		System.out.println(CarroBO.exibirCarros());
		
		String modelo = Magica.s("Digite o modelo para pesquisar").toUpperCase();
		Carro resposta = CarroBO.pesquisarModelo(modelo);
		System.out.println("Os carros cadastrados com esse modelo: " +resposta);
		
		String modelodelete = Magica.s("Digite o modelo para remover").toUpperCase();
		System.out.println(CarroBO.apagarCarro(modelodelete));
		System.out.println("Após apagar: \n" + CarroBO.exibirCarros());
		
		}catch (Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}
	}

}
