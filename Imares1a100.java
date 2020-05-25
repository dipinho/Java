package lista;

import java.util.Scanner;

public class ex2 { // impares de 1 a 100 e mostrar a soma de todos

	public static void main(String[] args) {
		int soma=1;
		for(int i = 1;i<=100;i++)
		if(i%2!=0) {
			System.out.println("Impares de 1 a 100: "+i);
			
			soma+=i;
			System.out.println("Soma: "+soma);
			
		
			
			
			//while(i<100)
		//		i++;
		//	soma+=i;
		//	System.out.println("Soma: "+soma);
			
		}
		
		
	}

}
