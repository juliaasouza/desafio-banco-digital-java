
public class ContaCorrente extends Conta {

	public ContaCorrente(int cpf) {
		super(cpf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
