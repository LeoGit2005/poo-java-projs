package coisa;

public class Principal {
	
	public static void main(String[] args) {
		
		PF pf1 = new PF();
		pf1.cpf = "038.504.374-69";
		pf1.rg = 1234567;
		pf1.endereco = "Quadra 103 lote 03";
		
		System.out.println(pf1.endereco);
		
	}

}
