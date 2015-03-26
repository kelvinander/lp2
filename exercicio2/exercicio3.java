public class ContaBancaria2{
	int agencia, contaCorrente, titularConta;
 	double saldo, limiteExtra;
	
	public void imprimirAgencia(){
		System.out.println("A agencia é: " + this.agencia);
	}

	public void imprimirContaCorrente(){
		System.out.println("A valor é: " + this.contaCorrente);
	}
	
	public void imprimirTitularConta(){
		System.out.println("O tirular da conta é: " + this.titularConta);
	}


	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}

	public void imprimirSaldoTotal(){
		double soma= this.saldo + this.limiteExtra;
		System.out.println(" Saldo  com limite extra" + soma);
		}
	
	public static void main (String [] args){
	
		ContaBancaria2 cb1 = new ContaBancaria2();
		cb1.agencia=3610;
		cb1.contaCorrente=15766;
		cb1.saldo=35.54;
		cb1.limiteExtra=50;

		ContaBancaria2 cb2 = new ContaBancaria2();
		cb2.agencia=810;
		cb2.contaCorrente=6132;
		cb2.saldo=42.31;
		cb2.limiteExtra=75.00;
		cb2.titularConta=1;
		
		cb2.imprimirAgencia();
		cb2.imprimirSaldo();
		cb2.imprimirSaldoTotal();
		cb2.imprimirTitularConta();
		cb2.imprimirContaCorrente();
	}
}
