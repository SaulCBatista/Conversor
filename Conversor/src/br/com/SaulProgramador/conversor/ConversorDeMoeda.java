package br.com.SaulProgramador.conversor;

import javax.swing.JOptionPane;

public class ConversorDeMoeda extends Conversor{
	
	@Override
	public String selecionarTipoDeConversao() {
		String[] tiposDeConvercoes = { "De Reais para Dólares", "De Reias para Euro" };
		String tipoDeConversaoSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu Principal", JOptionPane.DEFAULT_OPTION, null, tiposDeConvercoes, tiposDeConvercoes[0]);
		return tipoDeConversaoSelecionada;
	}
	
	@Override
	public double converter(String tipoDeConversao, double valor) {
		if(tipoDeConversao == "De Reais para Dólares") {
			return valor * 0.21;
		} else if(tipoDeConversao == "De Reias para Euro") {
			return valor * 0.19;
		}
		
		return 0;
	}
	
	@Override
	public void mostrarConversao(double valor) {
		JOptionPane.showMessageDialog(null, valor);
	}
	
}
