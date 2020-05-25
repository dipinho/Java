package lista;

import java.util.Scanner;

public class ex1 { // dois numeros, a soma e o produto

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double soma,produto;
		
		System.out.print("Insira um numero: ");
		Double n1 = s.nextDouble();
		
		System.out.print("Insira outro numero: ");
		Double n2 = s.nextDouble();
		
		soma = n1+n2;
		produto = n1*n2;
		
		System.out.print("A soma é: "+soma);
		System.out.println("");
		System.out.print("O produto é: "+produto);
		
		
	}

}
