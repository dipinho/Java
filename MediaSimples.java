package lista;

import java.util.Scanner;

public class exG25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double media, mediafinal;
		
		System.out.print("Primeira nota: ");
		Double nota1 = s.nextDouble();
		
		System.out.print("Segunda nota: ");
		Double nota2 = s.nextDouble();
		
		media = (nota1+nota2)/2;
		System.out.print("Média: "+media);
		System.out.println("");
		
		if(media>=7) {
			System.out.println("Aluno Aprovado");
			}
		
		else {
			System.out.println("Aluno de Final");
			System.out.println("");
			System.out.print("Nota da Final: ");
			Double notafinal = s.nextDouble();	
			
			mediafinal = (media+notafinal)/2;
			
			System.out.println("Media Final do aluno: "+mediafinal);
			
			if(mediafinal>=7) {
				System.out.println("Aluno Aprovado na final");
			}
			else {
				System.out.println("Aluno reprovado");
			}
			
			}
		
	}

}
