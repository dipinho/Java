package basic;
// Armazenar temperatura diaria por um ano

public class ArrayTemp {

	public static void main(String[] args) {
	
		double[] temperatura = new double[365];
		temperatura[0] = 31.3;
		temperatura[1] = 32;
		temperatura[2] = 33.7;
		temperatura[3] = 34;
		temperatura[4] = 33.1;
		
		System.out.println("O valor da temperatura é: "+temperatura[3]+"º");
		System.out.println("O tamanho do Array: "+ temperatura.length);
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia "+(i+1)+" é "+temperatura[i] );
		}
		System.out.println("----------------------------------------");
		for(double temp:temperatura) {
			System.out.println(temp);
		}
		

	}

}
