package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int vetorA[] = new int[3];
		double vetorB[] = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: "+i);
			vetorA[i] = s.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
			
		}

		System.out.print("Vetor de A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
	
		System.out.println();
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Vetor de B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i])+ " ");
		}
	}}
