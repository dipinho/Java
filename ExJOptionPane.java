package dipinho;

import javax.swing.JOptionPane;

public class ExJOptionPane {

	public static void main(String[] args) {
		
		// Exemplo de caixa gráfica simples
		JOptionPane.showMessageDialog(null, "Seja bem vindo"); 
		
		// Exemplo caixa com input de String
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		System.out.println(nome);
		
		// Exemplo de caixa de confirmação. Recebe um int como parametro
		int resposta = JOptionPane.showConfirmDialog(null, "Você é casado?");
		System.out.println(resposta);
		
	}
}
