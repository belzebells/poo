package POO;

public class Automovel {

	//declaração dos atributos da classe
	private String nomedoProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// criar método construtor
	public Automovel(String nomedoProprietario, String modelo, String placa, int ano) {
		super();
		this.nomedoProprietario = nomedoProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	
	//declaração de métodos get e set da minha classe
	}
	public String getNomedoProprietario() {
		return nomedoProprietario;
	}
	public void setNomedoProprietario(String nomedoProprietario) {
		this.nomedoProprietario = nomedoProprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//declaração de métodos específicos
	public void imprimirInfo() {
		System.out.println("\n " + nomedoProprietario +" possui um " +modelo+ " com placa: " + placa + " e ano: " + ano );
		
	}
	}
	

