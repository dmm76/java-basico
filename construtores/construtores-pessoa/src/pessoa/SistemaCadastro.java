package pessoa;

public class SistemaCadastro {
	public static void main(String [] args) {
		Pessoa douglas = new Pessoa("Douglas Marcelo", "021.687.190-37");
		//Pessoa douglas = new Pessoa()
		douglas.setEndereco("Rua dos Ipes, 312");
		
		//e como definiriamos nome e cpf
		//imprimindo
		
		System.out.println(douglas.getNome() + " - "+ douglas.getCpf());
	}
}
