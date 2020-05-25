package lista; //Receber dois números quaisquer e mostrar a diferença do maior pelo menor.

import java.util.Scanner;

public class exG23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int op;
		
		System.out.print("Digite um numero: ");
		int n1 = s.nextInt();
		
		System.out.print("Digite outro numero: ");
		int n2 = s.nextInt();
		
		if(n1>n2 ) {
			op=n1-n2;
			System.out.println(op);
		}
		else {
			op=n2-n1;
			System.out.println(op);
		}
		
		
	}

}
