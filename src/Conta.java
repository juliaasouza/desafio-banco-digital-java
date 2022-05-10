
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected int cpf;

	public Conta(int cpf) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cpf = cpf;
		
		System.out.println("Conta criada com sucesso!");
		System.out.println("O numero da sua nova conta e: " +numero);
	}
	
	public Conta(int agencia, int numero, int cpf) { // para a busca
		this.agencia = agencia;
		this.numero = numero;
		this.cpf = cpf;
	}

	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente!");
		}		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public int getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", Banco.getCadastros().get(this.cpf)));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
