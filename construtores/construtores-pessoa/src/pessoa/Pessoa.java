package pessoa;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	//CONSTRUTOR COM 2 PARAMETROS: NOME E CPF
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//CONTRUTOR PADRAO SEM PARAMETROS	
	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
