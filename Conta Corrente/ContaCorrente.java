package oo;

public class ContaCorrente {
	String titular;
	int numero;
	double saldo;
	boolean status;
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Operação Negada! Saldo insuficiente");
			System.out.println();
			return false;
		}
	}
	
	void deposita( double valor) {
		this.saldo +=  valor;
	}
	
	public boolean transfere( double valor, ContaCorrente destino) {
		if (this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	
	
	
}
