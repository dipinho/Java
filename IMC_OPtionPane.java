package dipinho;

import javax.swing.JOptionPane;

public class IMC_OPtionPane {

	public static void main(String[] args) {
		JOptionPane.showInternalMessageDialog(null, "IMC - Índice de Massa Corporal");
		
			float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura"));
		    float imc = peso/(altura*altura);

		    	if(imc<=18.5) {
		    		JOptionPane.showConfirmDialog(null, "IMC = "+imc+"\nAbaixo do Peso.");
		    	}else if(imc>=18.6 && imc<=24.9) {
		    		JOptionPane.showConfirmDialog(null, "IMC = "+imc+"\nParabens!!\nPeso ideal");
		    	}else if(imc>=25.5 && imc<=29.9) {
		    		JOptionPane.showConfirmDialog(null, "IMC = "+imc+"\nAtenção...\nLevemente acima do peso",null, JOptionPane.WARNING_MESSAGE);
		    	}else if(imc>=30.0 && imc<=34.9) {
		    		JOptionPane.showConfirmDialog(null, "IMC = "+imc+"\nAtencão Redobrada...\nObesidade Grau 1",null, JOptionPane.WARNING_MESSAGE);
		    	}else if(imc>=35.5 && imc<=39.9) {
		    		JOptionPane.showConfirmDialog(null, "IMC = "+imc+"\nAtencão Redobrada...\nObesidade Severa",null, JOptionPane.WARNING_MESSAGE);
		    	}else if(imc>40) {
		    		JOptionPane.showConfirmDialog(null, "IMC = "+imc+"\nObesidade Mórbida...",null, JOptionPane.WARNING_MESSAGE);
		    	}
    	System.exit(0);
	}
}