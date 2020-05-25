package lista;

import java.util.Scanner;

public class ex4 { //horas,minutos e segundos depois converter tudo em segundos

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double somaseg,totmin,totseg;

		System.out.print("Horas: ");
		Double horas  = s.nextDouble();
		
		System.out.print("Minutos: ");
		Double minutos  = s.nextDouble();

		System.out.print("Segundos: ");
		Double segundos  = s.nextDouble();
		
		totmin = horas*3600;
		totseg = minutos*60;
		somaseg = segundos+totmin+totseg;
		
		
		//System.out.println("Horas em segundos: "+totmin);
		//System.out.println("Minutos em segundos: "+totseg);

		System.out.println("Total em segundos é: "+somaseg);
		
		
	}

}
