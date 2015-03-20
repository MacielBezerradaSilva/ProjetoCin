
public class CadastroPessoa {
	
	private Pessoa[]pessoas;
	private Pessoa pessoa;
	private int cache;
	private int index;
	
	public CadastroPessoa(){
		this.cache = 100;
		this.index = 0;
		this.pessoas = new Pessoa[cache];
		this.pessoa = new Pessoa(); 
	}
	public void cadastroPessoa(Pessoa pessoa){
		pessoas[index++] = pessoa;
	}
	public void deletarPessoa(String nome){
		for(int i=0;i<index;i++){
			if(pessoas[i].getNome().equals(nome)){
				pessoas[i] = pessoas[index-1];
				pessoas[index-1]= null;
				index--;
			}
		}
	}
	public Pessoa pesquisaPessoa(String nome){
		for(int i=0;i<index;i++){
			if(pessoas[i].getNome().equals(nome)){
				return pessoas[i];
			}
		}
		return null;
	}
	public void update(String nome, String novoCpf,String novoNome){
		Pessoa pessoa = pesquisaPessoa(nome);
		pessoa.setCpf(novoCpf);
		pessoa.setNome(novoNome);
	}
	public void imprime(){
		for(int i=0;i<index;i++){
			System.out.println(pessoas[i].toString());
		}
	}

}
