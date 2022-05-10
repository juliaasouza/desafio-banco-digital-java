import java.util.HashMap;
import java.util.List;

public class Banco {

	private String nome;
	public static List<Conta> contas;
	private static HashMap<Integer, String> cadastros = new HashMap<Integer, String>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public static HashMap<Integer, String> getCadastros() {
		return cadastros;
	}
	
	public void setCadastros(HashMap<Integer, String> cadastros) {
		this.cadastros = cadastros;
	}
	
	public void imprimirContas() {
		for(Conta conta : contas) {
			conta.imprimirExtrato();
		}
	}
	
	public static int acharCliente(int cpf) { // confere se um cpf ja foi cadastrado
		if(cadastros.containsKey(cpf)) {
			return 0;
		}
		
		System.out.println("Esse cpf nao esta cadastrado. Realize um cadastro primeiro!");
		return 1;
	}
	
	public static Conta acharConta(int agencia, int numero, int cpf) { // confere se uma conta existe
		for(Conta conta : contas) {
			if(conta.getAgencia() == agencia && conta.getNumero() == numero && conta.getCpf() == cpf) {
				return conta;
			}
		}
		
		System.out.println("Revise as informacoes inseridas!");
		return null;
	}

}
