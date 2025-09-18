package exercicio_biblioteca;

public class Principal {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setTitulo("Livrus Titulus");
		l1.setAutor("Jeej");
		l1.setAnoPublicacao(1984);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("Biib shoos");
		
		b1.setLivro(l1);
		
		System.out.println(b1.getNome() + 
	 					" - " +
	 					b1.getLivro().getTitulo() +
	 					" - " + 
	 					b1.getLivro().getAutor() +
	 					" - " +
	 					b1.getLivro().getAnoPublicacao());
		
	}

}
