package atributo;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Endereco e2 = new Endereco();
		e2.setCep("71909000");
		e2.setLogradouro("Quadra 103");
		e2.setNumero(3);
		
		String nome = "Leonardo Oliveira";
		
		Aluno a2 = new Aluno(nome, e2);
		
		System.out.println(a2.getNome());
		System.out.println(a2.getEndereco().getLogradouro());
		System.out.println(a2.getRa());
		
	}

}
