package dipinho;

import java.util.*;

public class GarbageExample {
	
	private static Vector vector;
	public static void main(String[] args) {
		vector = new Vector();
		
		for (int i = 0; i < 50; i++) {
			vector.addElement(new StringBuffer("teste"));
			Runtime rt = Runtime.getRuntime();
			System.out.println("Memória Livre: " +rt.freeMemory());
			vector = null;
			System.gc();
			System.out.println("Memória Livre: " +rt.freeMemory());
		}
	}
}
