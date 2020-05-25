package lista;

import java.util.Scanner;

public class ex3 { //converter Celcius em Fahrenheit

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double Fah;
		
		
		System.out.print("Temperatura em Celcius: ");
		Double cel = s.nextDouble();
		
		Fah = (9*cel+160)/5;

		System.out.println("Temperatura em Fahrenheit é: "+Fah);

}}
