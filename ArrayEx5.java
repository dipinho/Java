package basic;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: "+i);
			vetorA[i] = s.nextInt();
			
			vetorB[i] = vetorA[i]*i;
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
	}

}
