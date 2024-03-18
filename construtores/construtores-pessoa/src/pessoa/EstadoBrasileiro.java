package pessoa;

public enum EstadoBrasileiro {
	//constantes de objetos
	SAO_PAULO("SP", "São Paulo", 11),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
	PIAUI("PI", "Piauí", 13),
	MARANHAO("MA", "Maranhão", 14),
	PARANA("PR", "Paraná", 15)
	;
	
	private String nome;
	private String sigla;
	private int codIbge;
	
	
	private EstadoBrasileiro(String sigla, String nome, int codIbge) {
		this.nome = nome;
		this.sigla = sigla;
		this.codIbge = codIbge;
	}

	public String getNome() {
		return nome;
	}

	
	public String getSigla() {
		return sigla;
	}
	
	public int getCodIbge() {
		return codIbge;
	}


	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
