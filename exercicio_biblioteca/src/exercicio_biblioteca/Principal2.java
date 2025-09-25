package exercicio_biblioteca;

import java.util.ArrayList;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setTitulo("Livrus Titulus");
		l1.setAutor("Jeej");
		l1.setAnoPublicacao(1984);
		
		Livro l2 = new Livro();
		l2.setTitulo("Librus Subtitulus");
		l2.setAutor("Jaaj");
		l2.setAnoPublicacao(1987);
		
		ArrayList<Livro> ls = new ArrayList<Livro>();
		ls.add(l1);
		ls.add(l2);
		
		Biblioteca b1 = new Biblioteca(ls);
		b1.setNome("Biib shoosh");
		
		System.out.println(b1.getNome());
		
		for (Livro livro : b1.getLivro()) {
			System.out.println(livro.getTitulo() + 
								" - " +
								livro.getAutor() +
								" - " +
								livro.getAnoPublicacao());
		}
	
	}

}



