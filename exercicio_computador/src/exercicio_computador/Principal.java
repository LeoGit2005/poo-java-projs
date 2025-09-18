package exercicio_computador;

public class Principal {
	
	public static void main(String[] args) {
		
		Computador c1 = new Computador();
		c1.set
	
		Processador p1 = new Processador();
		p1.setMarca("Markson");
		p1.setFrequencia("60 MHz");
		
		MemoriaRAM m1 = new MemoriaRAM();
		m1.setCapacidade("1 GB");
		m1.setTipo("Tipo");
		
		c1.setProcessador(p1);
		c1.setMemoriaRAM(m1);
		
		System.out.println(c1.getProcessador().getMarca() + 
							" - " +
							c1.getProcessador().getFrequencia() + 
							" - " + 
							c1.getMemoriaRAM().getCapacidade + 
							" - " +
							c1.getMemoriaRAM().getTipo());
		
	}
}
