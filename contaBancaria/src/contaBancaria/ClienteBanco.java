package contaBancaria
//Djonata Diego Henzel

public abstract class ClienteBanco implements Verifica {
	private int numeroConta = 0;
	private String nome = "";
	private Endereco ender = new Endereco();
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) throws NumException {
		if (numeroConta >= 0) {
			this.numeroConta = numeroConta;
		} else {
			throw new NumException();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEnder() {
		return ender;
	}

	public void setEnder(Endereco ender) {
		this.ender = ender;
	}

	// Metodo da classe Verifica
	public void validar() {
		if(getNumeroConta() % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

	public abstract void verifDoc();

}
