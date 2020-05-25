package lista;

import java.util.Scanner;

public class ex10 { //Salario de um funcionario. Desconto de 8,5% Previdencia e o restante desconta
					// 12,5% de imposto de renda. Nome, Salario Bruto e Salario Liquido

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double prev, imp, salliq , saldesconto;
		
		System.out.print("Funcionário: ");
		String nome = s.next();
		
		System.out.print("Salário do Funcionario: R$ ");
		Double salbruto = s.nextDouble();
		
		prev = salbruto*0.085;
		
		saldesconto = salbruto-prev;
		
		imp = saldesconto-(saldesconto*0.125); // na verdade é salário liquido
		
		
		System.out.println("Funcionario: "+nome);
		System.out.println("Salário Bruto: "+salbruto);
		System.out.println("Salário Liquido: R$ "+imp);
		
	   
	}

}
