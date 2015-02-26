package Entidade;

public class Endereco {
	
	private String rua;
	private String bairro;
	private int numero;
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){ 
		String str = "";
		return str = "rua: "+this.getRua()+"\n"+"bairro: "+this.getBairro()+"\n"
		+"numero: "+this.getNumero()+"\n";
	}

}
