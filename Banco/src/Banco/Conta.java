package Banco;

public class Conta {
	
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(){
		
	}
	public Conta(int numero,double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(int numero,double saldo,Cliente cliente){
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
