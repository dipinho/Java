package lista;

import java.util.Scanner;

public class ex8 { //Num consórcio, número total de prestações,quantd de prestações pagas e o valor da prestação. 
					//Calcular e mostrar o valor total pago e o saldo devedor.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double  valorprest , saldodev, saldopag, valorTot;
		int prestacoes, quita;
		
		prestacoes = 60;
		valorprest = 550.00;
		valorTot = 33000.00;
		
		System.out.print("Quantidade de prestações pagas: ");
		int quntdPrest = s.nextInt();
		System.out.println("");
		
		saldopag = quntdPrest*valorprest;
		
		System.out.print("Saldo Pago: R$ "+saldopag);
		System.out.println("");
		
		saldodev = valorTot-saldopag; 
		quita = prestacoes-quntdPrest;
		
		System.out.println("Saldo Devedor: R$ "+saldodev);
		System.out.println("");
		System.out.println("Faltam "+quita+" prestações para quitar seu débito");
		
		
		
	
		
		
		
		
		
		
		
	}

}
