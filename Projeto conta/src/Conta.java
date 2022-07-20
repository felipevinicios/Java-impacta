
public class Conta {
	
	public int numero;
	public String nome;
    public double Saldo;

	public void depositar (double v) {
		Saldo += v;
		
	}
	
	public void retirar (double v ) {
		Saldo -= v;
		
	}
	
	public double getSaldo() {
		 return Saldo;
	}
}
