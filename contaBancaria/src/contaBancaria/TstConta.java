package contaBancaria
//Djonata Diego Henzel

public class TstConta {
	private static NumException numExp = new NumException();
	private static PessoaJuridica pessoaJur = new PessoaJuridica();

	public static void main(String[] args) throws NumException {
		// Entrada de dados
		try {
			pessoaJur.setNumeroConta(12345);
			pessoaJur.setCnpj(1245689101);
			pessoaJur.getEnder().setRua("Rua Atilio de bona");
			pessoaJur.getResponsavel().setCpf(00604775340);
			pessoaJur.getResponsavel().setNome("Djonata Diego Henzel");
		} catch (NumException e) {
			numExp.impMsg();
		}

		if (pessoaJur.getNumeroConta() > 0) {
			impressaoDados();
		}
	}

	public static void impressaoDados() {
		// Impressão de dados
		System.out.println("Numero da conta: " + pessoaJur.getNumeroConta());
		pessoaJur.validar();
		System.out.println("CNPJ: " + pessoaJur.getCnpj());		
		System.out.println("Rua: " + pessoaJur.getEnder().getRua());
		System.out.println("CPF responsavel da Conta: " + pessoaJur.getResponsavel().getCpf());
		pessoaJur.getResponsavel().verifDoc(); 
		System.out.println("Nome: " + pessoaJur.getResponsavel().getNome());
		pessoaJur.verifDoc();
	}
}
