# Criando um Banco Digital com Java e Orientação a Objetos

Versão 1.0

* Classe Cliente agora possui apenas métodos. Seus atributos foram transferidos para um HashMap para facilitar a consulta por cpf

* Ao cadastrar um cliente, é preciso inserir um cpf único (que não esteja cadastrado ainda)

* Implementadas funções para conferir se um cpf está cadastrado e para conferir se uma conta existe

* Para acessar uma conta, o usuário deve fornecer agência, número da conta e cpf do titular

* Ao tentar fazer um saque, o programa confere se o saldo disponível é suficiente

* Adicionadas mensagens de sucesso ou fracasso em diversos métodos para facilitar o uso do programa

* Implementação de um menu interativo para uso do usuário (EM PROGRESSO - AINDA HÁ BUGS)

-> Possíveis melhorias:
* Criação de um sistema de senhas para acesso às contas (aumentando a segurança)