
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maciel Bezerra");
		pessoa.setCpf("908.453.333-90");
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("José Antonieu");
		pessoa1.setCpf("777.444.333-33");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Jack Joy");
		pessoa3.setCpf("000.111.444-22");
				
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		cadastroPessoa.cadastroPessoa(pessoa);
		cadastroPessoa.cadastroPessoa(pessoa1);
		cadastroPessoa.cadastroPessoa(pessoa3);
		cadastroPessoa.imprime();
		
		cadastroPessoa.deletarPessoa("Jack Joy");
		System.out.println("Depois da remorção"+"\n");
		cadastroPessoa.imprime();
		
		Pessoa pessoa4 = cadastroPessoa.pesquisaPessoa("Maciel Bezerra");
		System.out.println(pessoa4.toString());
		
		cadastroPessoa.update("Maciel Bezerra","000.000.000.00","Jose Antonieu");
		
		cadastroPessoa.imprime();
	}

}
