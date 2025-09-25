package exercicio_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	public Biblioteca() {
		
	}
	
	public Biblioteca(ArrayList<Livro> livro) {
		this.livro = livro;
	}
	
	private String nome;
 	private ArrayList<Livro> livro = new ArrayList<Livro>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getLivro() {
		return livro;
	}

	public void setLivro(ArrayList<Livro> livro) {
		this.livro = livro;
	}
	
}
