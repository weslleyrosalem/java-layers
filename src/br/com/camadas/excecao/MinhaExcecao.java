package br.com.camadas.excecao;

public class MinhaExcecao extends Exception{
	
	public static String tratar(Exception e) {

	
			if (e instanceof NullPointerException) {
				return "Há um objeto nulo";
				
			}else if (e instanceof NumberFormatException) {
				return "Numero invalido";
				
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				return "Vetor Estourou";
			} else {
				e.printStackTrace();
				return "Excecao nao conhecida";
				}

	}
}