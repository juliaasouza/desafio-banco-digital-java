
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int cpf) {
		super(cpf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
