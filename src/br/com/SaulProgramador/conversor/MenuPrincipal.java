package br.com.SaulProgramador.conversor;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	public void iniciar() {
		
		String[] convercoes = { "Conversor de moeda", "Conversor de temperatura" };
		
		String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu Principal", JOptionPane.DEFAULT_OPTION, null, convercoes, convercoes[0]);
		
		Conversor conversor = null;
		
		if(opcaoSelecionada == "Conversor de moeda") {
			conversor = CriarConversao.criarConversorDeMoeda();
		}
		
		double valor = Float.valueOf(JOptionPane.showInputDialog(null, "Insira um valor:"));
		
		selecionarConversao(conversor, valor);
	}
	
	public void selecionarConversao(Conversor conversor, double valor) {
		String tipoDeConversao = conversor.selecionarTipoDeConversao();
		double resultado = conversor.converter(tipoDeConversao, valor);
		conversor.mostrarConversao(resultado);
	}
	
}
