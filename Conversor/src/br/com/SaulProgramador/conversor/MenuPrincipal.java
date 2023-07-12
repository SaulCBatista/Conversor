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
		
		String entranda = JOptionPane.showInputDialog(null, "Insira um valor:");
		System.out.println(entranda);
		
		if(entranda.isEmpty()) {
			
			JOptionPane.showMessageDialog(null, "É necessario preencher o campo de valor!");
		} else {
			
			try {
				
				double valor = Double.valueOf(entranda);
				selecionarConversao(conversor, valor);
			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Por favor, insira números!");
			}
		}
		
	}
	
	public void selecionarConversao(Conversor conversor, double valor) {
		
		String tipoDeConversao = conversor.selecionarTipoDeConversao();
		double resultado = conversor.converter(tipoDeConversao, valor);
		conversor.mostrarConversao(resultado);
		reiniciar();
	}
	
	public void reiniciar() {
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", null, JOptionPane.YES_NO_OPTION);
		
		if(resposta == 0) {
			
			iniciar();
		} else if(resposta == 1) {
			
			JOptionPane.showMessageDialog(null, "Programa finalizado!");
		}
	}
	
}
