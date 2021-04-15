package basic;

import java.util.Scanner;

public class ArrayEx9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int vetorA[] = new int[3];
		float vetorB[] = new float[vetorA.length];
		float vetorC[] = new float[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Valor de A na posicão "+i+" " );
			vetorA[i] = s.nextInt();
			
			System.out.print("Valor de B na posição "+i+" ");
			vetorB[i] = s.nextFloat();
			
			vetorC[i] = (int) (vetorA[i] / vetorB[i]); 
		}
		
			System.out.print("Vetor A = ");
				for (int i = 0; i < vetorA.length; i++) {
					System.out.print(vetorA[i]+ " ");
				}
			System.out.println();
			
			System.out.print("Vetor B = ");
				for (int i = 0; i < vetorB.length; i++) {
					System.out.print(vetorB[i]+ " ");
				}
			System.out.println();
			
			System.out.print("Vetor C = ");
				for (int i = 0; i < vetorC.length; i++) {
					System.out.print(vetorC[i]+ " ");
				}
	}
}
