package dipinho;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aulas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// Valor Hora aula = VH = 24,07
		// Aula diurno = 4h
		// Aula noturno = 3h
		
		int diasM, diasN;
		double VH = 24.07; 
		
		System.out.println("==== Calculo de Horas =====");
		System.out.println("");
		System.out.print("Aulas pela manhã: ");
		diasM = s.nextInt();
		
		System.out.print("Aulas pela noite: ");
		diasN = s.nextInt();		
		System.out.println("");
		
		double diurno = ((4*VH)*diasM);
		double noturno =  ((3*VH)*diasN);
		
		System.out.println("Valor aulas turno MATUTINO: R$ "+df.format(diurno));
		System.out.println("Valor aulas turno NOTURNO: R$ "+df.format(noturno));
		System.out.println("");
		
		double totalHR = diurno + noturno;
		
		System.out.println("Valor sem desconto: R$"+df.format(totalHR));
		System.out.println("");
		
		double inss = (totalHR*0.09);
		System.out.println("INSS - R$"+df.format(inss));
		
		double ir = (totalHR*0.075);
		System.out.println("IR - R$"+df.format(ir));
		
		double percentFerias = (totalHR/3);
		System.out.println("1/3 ferias - R$"+df.format(percentFerias));
		
		double percentFerias2 = (totalHR/12);
		System.out.println("1/12 ferias - R$"+df.format(percentFerias2));
		
		double SalLiq = (totalHR+percentFerias+percentFerias2)-(inss+ir);
		System.out.println("");
		
		System.out.println("Total a receber: R$"+df.format(SalLiq));
		
	}

}
