package br.com.SaulProgramador.conversor;

public class CriarConversao {
	
	private CriarConversao() {
	}
	
	public static Conversor criarConversorDeMoeda() {
		return new ConversorDeMoeda();
	}
}
