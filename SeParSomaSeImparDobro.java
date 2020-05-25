package lista;

import java.util.Scanner;

public class exG21 { // Grupo 2 Ex 1 - Digitar um numero, se for PAR mostrar a metade, se for IMPAR
					//mostrar o dobro

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double op;
		System.out.print("Digite um numero: ");
		Double num = s.nextDouble();
		if(num%2==0) {
			System.out.print("Numero Par");
			op = num/2;
			System.out.println("");
			System.out.println("Metade: "+op);
		}
		else {
			System.out.print("Numero Impar");
			op = num*2;
			System.out.println("");
			System.out.println("Dobro: "+op);
		}
		
		
	}

}
