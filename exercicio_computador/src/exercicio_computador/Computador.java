package exercicio_computador;

public class Computador {
	
	private String exibirDetalhes;
	private Processador processador;
	private MemoriaRAM memoriaRAM;

	public Computador(String exibirDetalhes, Processador processador) {
		this.exibirDetalhes = exibirDetalhes;
		this.processador = processador;		
	}
	
	public Computador(String exibirDetalhes, MemoriaRAM memoriaRAM) {
		this.exibirDetalhes = exibirDetalhes;
		this.memoriaRAM = memoriaRAM;		
	}
	
	public String getExibirDetalhes() {
		return exibirDetalhes;
	}

	public void setExibirDetalhes(String exibirDetalhes) {
		this.exibirDetalhes = exibirDetalhes;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public MemoriaRAM getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

}
