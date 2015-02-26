
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		cliente.setNome("Gilson Felix");
		cliente.setCpf("800.900.980-00");
		conta.setCliente(cliente);
		conta.setNumero(12345);
		conta.setSaldo(100.00);
		
		System.out.println(conta.toString());
		conta.creditar(150,12345);
		System.out.println("Novo Saldo creditado :"+conta.getSaldo()+"\n");
		
		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maciel José");
		cliente1.setCpf("333.000.542-11");
		conta1.setCliente(cliente1);
		conta1.setNumero(4321);
		conta1.setSaldo(0);
			
		System.out.println(conta1.toString());
		conta1.creditar(10,4321);
		System.out.println("Novo Saldo creditado :"+conta1.getSaldo()+"\n");
		
		conta.debitar(10,4321);
		System.out.println("Saldo debitado do cliente "+cliente.getNome()+": "+conta.getSaldo());
		conta1.debitar(2,4321);
		
		System.out.println("Saldo debitado do cliente "+cliente1.getNome()+": "+conta1.getSaldo());

	}

}
