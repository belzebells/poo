package POO;

public class AutomovelTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe automóvel
		
		Automovel auto1 = new Automovel ("jorge", "fusca", "miau666", 2666);
		
		auto1.imprimirInfo();
		
		auto1.setNomedoProprietario("antônia");
		
		auto1.setPlaca("m1au666");
		
		auto1.imprimirInfo();
		
	}

}
