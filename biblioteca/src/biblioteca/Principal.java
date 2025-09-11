package biblioteca;

public class Principal {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.titulo = "FNAF: The Silver Eyes";
		l1.anoPublicacao = 2015;
		l1.empDev = "emprestar";
		l1.autor = "Kira Breed-Brisley e Scott Cawthon";
		l1.numPag = 240;
		
		Tese t1 = new Tese();
		t1.titulo = "Explosão Infinita";
		t1.anoPublicacao = 2007;
		t1.empDev = "devolver";
		t1.autor = "Jacinto Jonas";
		t1.cursoOrigem = "Sociologia";
		
		Revista r1 = new Revista();
		r1.titulo = "Carambolas Científicas";
		r1.anoPublicacao = 2012;
		r1.empDev = "devolver";
		r1.edicao = 5;
		r1.mesPublicacao = "Dezembro";
		
		System.out.println(l1.titulo);
		System.out.println(l1.autor);
		
	}

}
