package br.com.camadas.modelo;

public class Carro {
	private String modelo;
	private float valor;
	private String cor;
	private int ano;
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", valor=" + valor + ", cor=" + cor + ", ano=" + ano + "]";
	}
	
	public Carro() {
		super();
	}
	
	public Carro(String modelo, float valor, String cor, int ano) {
		super();
		this.modelo = modelo;
		this.valor = valor;
		this.cor = cor;
		this.ano = ano;
	}
	
	public void setAll(String modelo, float valor, String cor, int ano) {
		this.modelo = modelo;
		this.valor = valor;
		this.cor = cor;
		this.ano = ano;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	

}
