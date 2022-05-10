import java.util.Scanner;

public class Menu {
	static void chamarMenu() {
		while(true) {
			System.out.println("Escolha uma opcao do menu a seguir:");
			System.out.println("1 - cadastrar um cliente");
			System.out.println("2 - abrir uma conta");
			System.out.println("3 - realizar uma operacao");
			System.out.println("4 - encerrar o programa");
			
			Scanner scan = new Scanner(System.in);
			String choice = scan.next(); // NoSuchElement Exception ??
			switch(Integer.parseInt(choice)) {
				case 1:
					Cliente.criarCliente();
					break;
				case 2:
					System.out.println("Qual sera o cpf do titular da conta?");
					int cpf = scan.nextInt();
					int success = Banco.acharCliente(cpf);
					
					if(success == 0) {
						System.out.println("Digite 1 para conta corrente e 2 para conta poupanca");
						int correntePoupanca = scan.nextInt();
						if(correntePoupanca == 1) {
							Conta conta = new ContaCorrente(cpf);
							Banco.contas.add(conta);
						}
						else if(correntePoupanca == 2) {
							Conta conta = new ContaPoupanca(cpf);
							Banco.contas.add(conta);
						}
						else {
							System.out.println("Erro. Opcao invalida!");
						}
					}
					break;
				case 3:
					System.out.println("Escolha a operacao desejada:");
					System.out.println("1 - saque");
					System.out.println("2 - deposito");
					System.out.println("3 - transferencia");
					System.out.println("4 - retornar ao menu anterior");
					int operacao = scan.nextInt();
					
					if(operacao == 4) {
						break;
					}
					
					System.out.println("Agora insira a agencia, o numero da conta, e o cpf do titular:");
					int agencia = scan.nextInt();
					int numero = scan.nextInt();
					int cpf2 = scan.nextInt();
					int valor = 0;
					Conta conta2 = Banco.acharConta(agencia, numero, cpf2);
					if(conta2 != null) {
						switch(operacao) {
							case 1:
								System.out.println("Qual o valor a ser sacado?");
								valor = scan.nextInt();
								conta2.sacar(valor);
								break;
							
							case 2:
								System.out.println("Qual o valor a ser depositado?");
								valor = scan.nextInt();
								conta2.depositar(valor);
								break;
							
							case 3:
								System.out.println("Agora insira a agencia, o numero da conta, e o cpf do titular da conta do destinatario:");
								int agenciaDest = scan.nextInt();
								int numeroDest = scan.nextInt();
								int cpfDest = scan.nextInt();
								Conta contaDest = Banco.acharConta(agenciaDest, numeroDest, cpfDest);
								
								if(contaDest != null) {
									System.out.println("Qual o valor a ser transferido?");
									valor = scan.nextInt();
									conta2.transferir(valor, contaDest);
									
								}
								
								else {
									System.out.println("Revise as informacoes inseridas!");
								}
								
								break;
								
							default:
								break;
								
						}
					}
				case 4:
					return;
				default:
					continue;
			}
		}
	}
}
