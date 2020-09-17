package dipinho;

import java.lang.Math;

public class ExemploMath {

	public static void main(String[] args) {
			System.out.println("==== Constantes =============");
				System.out.println("O valor de Pi é: " +Math.PI);
				System.out.println("O valor de E é: "+Math.E);
				System.out.println();
			
			System.out.println("==== Exponenciação e Potência ====");
				int x = 3;
				// System.out.println("'e' elevado ao quadrado é: "+Math.exp(0)); 
				System.out.println("2 elevado ao cubo é: "+Math.pow(2,x));
				System.out.println();
			
			System.out.println("==== Raiz Quadrada e Cúbica =====");
				int num = 9;
				System.out.println("RaizQ de "+num+" é "+Math.sqrt(num));
				System.out.println("RaizC de "+num+" é "+Math.cbrt(num));
				System.out.println();
			
			System.out.println("==== Seno, Cosseno e Tangente =====");
				int i = 30;
				System.out.println("O seno de "+i+" é: "+Math.sin(i));
				System.out.println("O cosseno de "+i+" é: "+Math.cos(i));
				System.out.println("A tangente de "+i+" é: "+Math.tan(i));
				System.out.println();
				
			System.out.println("======== Arredondar =========");
				double y = 2.5;
				System.out.println("Arredondando pra cima: "+Math.ceil(y));
				System.out.println("Arredondando pra baixo: "+Math.floor(y));
				System.out.println();
				
			System.out.println("======== Resto da Divisão =========");
				
				System.out.println("O resto da divisão é: "+Math.floorMod(7, 5));
				System.out.println();
	}
}
