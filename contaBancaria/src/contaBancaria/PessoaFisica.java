package contaBancaria
//Djonata Diego Henzel

public final class PessoaFisica extends ClienteBanco {

	private int cpf = 0;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public void verifDoc() { 			
		if(getCpf() >= 10 && getCpf() <= 20) {
			System.out.println("CPF válido");
		}else {
			System.out.println("CPF inválido");
		}
	}
}
