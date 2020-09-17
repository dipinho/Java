package dipinho;

import javax.swing.JOptionPane;

public class somaInterface {
	public static void main(String[]args) {
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo\n Aqui efetuaremos uma soma.");
		
	    String numeroA = JOptionPane.showInputDialog("Digite o primeiro número:");
	    String numeroB = JOptionPane.showInputDialog("Digite o segundo número:");

	    int numero1 = Integer.parseInt(numeroA);
	    int numero2 = Integer.parseInt(numeroB);

	    numero1 = Integer.valueOf(numeroA);
	    numero2 = Integer.valueOf(numeroB);

	    int soma = numero1 + numero2;
	    
	    	if(soma<=30) {
	    		JOptionPane.showMessageDialog(null,"Resultado "+soma+"\nSoma menor que 30! ",null, JOptionPane.WARNING_MESSAGE);
	    	
	    	}else{
	    		JOptionPane.showMessageDialog(null,"Soma maior que 30! "+"\nResultado "+soma,null,JOptionPane.WARNING_MESSAGE);
	    }


  	}
}