package br.com.SaulProgramador.conversor;

public abstract class Conversor {

	public abstract String selecionarTipoDeConversao();
	
	public abstract double converter(String tipoDeConversao, double valor);
	
	public abstract void mostrarConversao(double valor);
	
}
