package lista;

import java.util.Scanner;

public class ex9 { //Loja paga dois salarios pro vendedor, + comissao de 150 por carro + 5% do montante
	// de venda. Qual salario final?

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double salariofixo, comissao,bonus, salprev , salfinal;
				
		salariofixo = 1996.0;
		bonus = 150.00;
		
		System.out.print("Vendedor: ");
		String nome = s.next();
		
		System.out.print("Quantos carros "+nome+ " vendeu: ");
		int vendacar = s.nextInt();
		
		comissao = bonus*vendacar;
		System.out.println("Comissao: R$ "+comissao);
		
		salprev = salariofixo+comissao;
		salfinal = salprev + (salprev*0.05);
		
		System.out.println("Vendedor "+nome+ ", seu salário Final é de R$ "+salfinal);
		
		

	}

}
