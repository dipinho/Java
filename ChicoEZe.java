package lista; //Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro
				//e cresce 3 centímetros por ano. Calcule e imprima quantos anos serão necessários
				//para que Zé seja maior que Chico.

import java.util.Scanner;

public class ExG33 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double chico,ze;
		int anos;
		
		chico = 1.50;
		ze = 1.10;
		anos=0;
		
		while(chico> ze) {
			chico+=0.02;
			ze+=0.03;
			++anos;
			
			
			System.out.println(anos);
		}
		
		
		
		
		

	}

}
