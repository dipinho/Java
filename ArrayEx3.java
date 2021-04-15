package basic;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: "+i);
			vetorA[i] = s.nextInt();
			
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		
		System.out.print("Vetor de A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
	
		System.out.println();
		
		System.out.print("Vetor de B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		
	}
}
