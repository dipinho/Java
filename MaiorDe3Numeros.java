package lista; //Receber três números inteiros e mostrar o maior e o menor dos números lidos.

import java.util.Scanner;

public class exG24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Primeiro numero: ");
		int n1 = s.nextInt();
		
		System.out.print("Segundo numero: ");
		int n2 = s.nextInt();
		
		System.out.print("Terceiro numero: ");
		int n3 = s.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Primeiro numero é maior");
			}
		if(n2>n1 && n2>n3 ) {
			System.out.println("Segundo numero é maior");
		}
		if(n3>n1 && n3>n2) {
			System.out.println("Terceiro numero é maior");
		}
		
	}

}
