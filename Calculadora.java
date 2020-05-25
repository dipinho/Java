package lista;  //Criar um programa de calculadora, onde possui as opções: 
				//1-Somar , 2-Subtrair , 3-Multiplicar , 4-Dividir , 5-Finalizar, 
				//recebe dois números e executa a operação através do uso de funções. 
				//Mostrar a resposta e repetir o menu até escolher a opção 5.


import java.util.Scanner;

public class EXG510 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double div;
		int soma,sub,mult,op; 
		System.out.println("-------Calculadora-------");
		System.out.print("Digite o primeiro numero:");
		int n1 = s.nextInt();
		System.out.print("Digite o segundo numero:");
		int n2 = s.nextInt();		
		
		do {
		System.out.println("Escolha uma opção");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Finalizar");
		
		op = s.nextInt();		
		
		switch (op) {
		case 1: 
			soma=n1+n2;
			System.out.println("Resultado: "+soma);
			System.out.print("");
		break;
		case 2: 
			sub=n1-n2;
			System.out.println("Resultado: "+sub);
			System.out.print("");
		break;
		case 3: 
			mult=n1*n2;
			System.out.println("Resultado: "+mult);
			System.out.print("");
		break;
		case 4: 
			div=(double) (n1/n2);
			System.out.println("Resultado: "+div);
			System.out.print("");
		break;
		case 5: 
			System.out.println("Programa finalizado");
			System.exit(0);
		break;
		 default:
			 System.out.println("Erro!! Opção Inexistente ");
			 break;
			}
		
		}while(op!=5);
	

}}
