package Repositorio;

import Entidade.Cliente;

public class ClienteRepositorio {

	private Cliente clientes[];
	private int tam;
	private static int indice;
	private Cliente cliente;

	public ClienteRepositorio(){
		this.indice = 0;
		this.tam = 100;
		this.clientes = new Cliente[tam];
	}

	public Cliente[] getCliente() {
		return clientes;
	}

	public void setCliente(Cliente[] cliente) {
		this.clientes = cliente;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public void adicionar(Cliente cliente){
		for(int i=0;i<this.clientes.length;i++){
			if(this.clientes[i]==null){
				this.clientes[i]=cliente;
				//o indece serve para ter controle da quantidade de clientes inserido no array
				indice++;
				break;
			}
		}	
	}

	public void remover(int id){
		for(int i=0;i<indice;i++){
			if(clientes[i].getId()==id){
				this.clientes[i]= this.clientes[indice-1];
				this.clientes[indice-1]=null;
				indice--;
				break;
			}
		}
		
	}
	
	public String pesquisar(int id){
		for(int i=0;i<this.clientes.length;i++){
			if(clientes[i].getId()==id){
				return clientes[i].toString();
			}
			System.out.println("Erro! cliente não encontrado");	
			break;
		}
		return null;
	}
	
	public void imprimir() {
		for(int i=0;i<indice;i++){
			System.out.println("Clientes: "+"\n"
					+"--------------------------"+"\n"
					+clientes[i].toString());
		}
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
}
