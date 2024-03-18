package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(18);
		
		Aluno douglas = new Aluno();
		douglas.setNome("Douglas Marcelo Monquero");
		douglas.setIdade(48);
		
		System.out.println("O aluno: " + felipe.getNome() + " tem a idade de: "+ felipe.getIdade() + " anos.\n");
		
		System.out.println("O aluno: " + douglas.getNome() + " tem a idade de: "+ douglas.getIdade() + " anos.\n");
		
	}
}
