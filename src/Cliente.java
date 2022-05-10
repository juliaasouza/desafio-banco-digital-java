import java.util.Collection;
import java.util.Scanner;

public class Cliente {
	
//	private String nome;
//	private int cpf;
//	
//	Cliente(String nome, int cpf){
//		this.nome = nome;
//		this.cpf = cpf;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public int getCpf() {
//		return cpf;
//	}
//	
//	public void setCpf(int cpf) {
//		this.cpf = cpf;
//	}
	
	public static void criarCliente() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do cliente:");
		String nome = scan.next();
		System.out.println("Digite o cpf do cliente:");
		String cpf = scan.next();
		
		scan.close();
		
		//Cliente cliente = new Cliente(nome, cpf);
		
		if(Banco.getCadastros().containsKey(Integer.parseInt(cpf))) {
			System.out.println("Esse cpf ja esta cadastrado!");
		}
		
		Banco.getCadastros().put(Integer.parseInt(cpf), nome);
		System.out.println("Novo cliente cadastrado com sucesso!");
	}

}
