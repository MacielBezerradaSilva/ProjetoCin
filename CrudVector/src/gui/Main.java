package gui;

import Entidade.Cliente;
import Entidade.Endereco;
import Repositorio.ClienteRepositorio;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		ClienteRepositorio cr = new ClienteRepositorio();
		cliente.setNome("Maciel Bezerra");
		cliente.setId(12345);
		cliente.setCpf("345.987.098-90");
		endereco.setRua("Rua São João");
		endereco.setNumero(123);
		endereco.setBairro("Centro");
		cliente.setEndereco(endereco);
		cr.adicionar(cliente);
		
		Cliente cliente1 = new Cliente();
		Endereco endereco1 = new Endereco();
		cliente1.setNome("Gilson Felix");
		cliente1.setId(1234);
		cliente1.setCpf("111.111.111-22");
		endereco1.setRua("Rua da Areia");
		endereco1.setNumero(12367);
		endereco1.setBairro("Centro");
		cliente1.setEndereco(endereco1);
		cr.adicionar(cliente1);
		
		Cliente cliente2 = new Cliente();
		Endereco endereco2 = new Endereco();
		cliente2.setNome("Jose Chupetinha");
		cliente2.setId(1111);
		cliente2.setCpf("000.999.000-11");
		endereco2.setRua("Rua do Bagaru");
		endereco2.setNumero(9999);
		endereco2.setBairro("Areial");
		cliente2.setEndereco(endereco2);
		
		cr.adicionar(cliente2);
		
		cr.imprimir();
		
		cr.remover(12345);
		
		System.out.println("Depois da remoção: "+"\n");
		cr.imprimir();
		
		System.out.println("Depois da Pesquisa: "+"\n");
		
		System.out.println(cr.pesquisar(1111));
	}

}
