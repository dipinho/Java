package oo;

public class Movimentacoes {

	public static void main(String[] args) {
		ContaCorrente contaDoGeorge = new ContaCorrente();
		contaDoGeorge.titular = "George DiPinho";
		contaDoGeorge.numero = 0010;
		contaDoGeorge.saldo = 25000;
		
		ContaCorrente contaDaIngrid = new ContaCorrente();
		contaDaIngrid.titular = "Ingrid Barreto";
		contaDaIngrid.numero = 0012;
		contaDaIngrid.saldo = 15000;
		
		ContaCorrente contaDoPiteco = new ContaCorrente();
		contaDoPiteco.titular = "Piteco";
		contaDoPiteco.numero = 0013;
		contaDoPiteco.saldo = 20;
		
		System.out.println("A conta do Sr "+contaDoGeorge.titular+" possui R$ "+contaDoGeorge.saldo+" de saldo disponível");
		System.out.println("A conta da Sra "+contaDaIngrid.titular+" possui R$ "+contaDaIngrid.saldo+" de saldo disponível");
		System.out.println("A conta do "+contaDoPiteco.titular+" só tem R$ "+contaDoPiteco.saldo+" de saldo disponível");

		System.out.println("====================================================================");
		contaDoGeorge.transfere(300, contaDaIngrid);
		System.out.println();
		
		System.out.println("Saldo atual da conta corrente do "+contaDoGeorge.titular+" é R$ "+contaDoGeorge.saldo);
		
		System.out.println("====================================================================");
		contaDaIngrid.transfere(100, contaDoPiteco);
		contaDoPiteco.saca(50);
		contaDoGeorge.transfere(50, contaDoPiteco);
		System.out.println("Saldo atual do "+contaDoPiteco.titular+" é de R$ "+contaDoPiteco.saldo);
		System.out.println("====================================================================");
		
		System.out.println("Saldo atual do "+contaDoGeorge.titular+" é de R$ "+contaDoGeorge.saldo);
		System.out.println("====================================================================");
		
		System.out.println("Saldo atual do "+contaDaIngrid.titular+" é de R$ "+contaDaIngrid.saldo);
		System.out.println("====================================================================");
		
		if(contaDaIngrid.transfere(3000, contaDoGeorge)) {
			System.out.println("Parabéns "+contaDaIngrid.titular+"! Transação efetuada com sucesso!!");
			System.out.println("Seu novo saldo é de R$ "+contaDaIngrid.saldo);
		}else {
			System.out.println("Saldo insuficiente...");
		}
		
		System.out.println("Saldo atual do "+contaDoGeorge.titular+" é de R$ "+contaDoGeorge.saldo);
		System.out.println("====================================================================");
		
		if(contaDoPiteco.transfere(1000, contaDaIngrid)) {
			System.out.println("Parabéns "+contaDoPiteco.titular+"! Transação efetuada com sucesso!!");
			System.out.println("Seu novo saldo é de R$ "+contaDoPiteco.saldo);
		} else {
			System.out.println("Saldo insuficiente...");
		}
		
				
		
		
		
		
	}

}
