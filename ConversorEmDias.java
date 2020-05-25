package lista;

import java.util.Scanner;

public class ex5 { // anos, meses e dias e depois mostrar o total em dias

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double totdias, totmes, somadias;
		
		System.out.print("Ano: ");
		Double ano  = s.nextDouble();
		
		System.out.print("Mês: ");
		Double meses  = s.nextDouble();
		
		System.out.print("Dia: ");
		Double dias  = s.nextDouble();
		
		totdias = dias*365; // ano para dias
		totmes = dias*30.417; //mes para dias
		
		somadias = totdias+totmes+dias;
		
		System.out.println("Total de dias será: "+somadias);
		
	}

}
