package oo;

import java.util.Scanner;

public class TestaAgenda {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nome da agenda: ");
		String nome = s.next();
		
		Agenda agenda = new Agenda();
			
		Contato[] contatos = new Contato[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite as informações do contato: "+(i+1));
			Contato c = new Contato();
			
			
			System.out.print("Digite o nome: ");
			nome = s.nextLine();
			c.setNome(nome);
			
			System.out.print("Digite o telefone: ");
			String telefone = s.nextLine();
			c.setTelefone(telefone);
			
			System.out.print("Digite o email: ");
			String email = s.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
			agenda.setContatos(contatos);
			
			if (agenda != null) {
				System.out.println(agenda.obterInfo());				
			}
	}	

}
