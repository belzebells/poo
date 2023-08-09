package POO;

public class clientes {

	//declaração dos atributos da classe
	private String NomedoCliente;
	private String ApelidodoCliente;
	private String CidadedoCliente;
	private String EstadodoCliente;
	private int idade;
	

	//criar método construtor
	
	public clientes(String NomedoCliente, String ApelidodoCliente, String CidadedoCliente, String EstadodoCliente, int idade) {
		super();
		this.NomedoCliente = NomedoCliente;
		this.ApelidodoCliente = ApelidodoCliente;
		this.CidadedoCliente = CidadedoCliente;
		this.EstadodoCliente = EstadodoCliente;
		this.idade = idade;
		
	//declaração dos métodos get e set da minha classe
	
	} 
	public String getNomedoCliente() {
		return NomedoCliente;
	}
	public void setNomedoCliente(String NomedoCliente) {
		this.NomedoCliente = NomedoCliente;
	}
	public String getApelidodoCliente() {
		return ApelidodoCliente;
	}
	public void setApelidodoCliente(String ApelidodoCliente) {
		this.ApelidodoCliente = ApelidodoCliente;
	}
	public String GetCidadedoCliente() {
		return ApelidodoCliente;
	}
	public void SetCidadaedoCliente(String CidadedoCliente) {
		this.CidadedoCliente = CidadedoCliente;
	}
	public String GetEstadodoCliente() {
		return EstadodoCliente;
	}
	public void SetEstadodoCliente(String EstadodoCliente) {
		this.EstadodoCliente = EstadodoCliente;
	}
	public int Getidade() {
		return idade;
	}
	public void Setidade(int idade) {
		this.idade = idade;
	}
	
	//declaração de métodos específicos
	
		public void imprimirInfo() {
			System.out.println("\no cliente é "+NomedoCliente+ 
					"\no apelido dele é "+ApelidodoCliente+ 
					"\nele mora na cidade de "+CidadedoCliente+
					"\nque fica no estado de "+EstadodoCliente+ 
					"\ne tem " +idade+ " anos");}
		
		
	
}


