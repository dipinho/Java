package lista; //Dois números, calcular e mostrar a soma do primeiro pelo dobro do segundo
				//se eles forem diferentes ou a diferença do primeiro pela metade do segundo
				//se eles forem iguais.

import java.util.Scanner;

public class exG22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double op;
		
		System.out.print("Digite primeiro numero: ");
		int n1 = s.nextInt();
		
		System.out.print("Digite segundo numero: ");
		int n2 = s.nextInt();
		
		if(n1!=n2) {
			System.out.println("Números diferentes");
			op=(double) (n1+(n2*2));
			System.out.println(op);
			
		}
		else {
			op = (double) (n1-(n2/2));
			System.out.println(op);
			
		}
		
	}

}
