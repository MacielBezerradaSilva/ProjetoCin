package Entidade;

public class Cliente {
	
	private String nome;
	private int id;
	private String cpf;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String toString(){
		String str = "";
		return str = "nome do cliente: "+ this.getNome()+"\n"+"cpf do cliente: "+this.getCpf()+"\n"
		+"id do cliente: "+this.getId()+"\n"+this.getEndereco().toString();
	}
}
