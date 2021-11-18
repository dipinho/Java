package oo;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("George");
		//contato.setEndereco("Bigo House");
		//contato.setTelefone("98 98765-4321");
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua 2");
		end.setNumero("SN");
		end.setComplemento("Bloco 7 ");
		end.setCep("65000-000");
		end.setCidade("São Luís");
		end.setEstado("MA");
		
		
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("98");
		telefone.setNumero("9876-5432");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("98");
		telefone2.setNumero("3456-7890");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		contato.setEndereco(end);
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/* if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
				
				
			}
		}
	}
}
