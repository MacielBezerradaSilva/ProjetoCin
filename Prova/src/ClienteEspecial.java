
public class ClienteEspecial extends Cliente{
	
	private double desconto;
	private Cliente clientes[];
	private int qtdCliente;
	
	public ClienteEspecial(String nome, double valor, int id, double desconto) {
		super(nome, valor, id);
		this.desconto = desconto;
		this.clientes = new Cliente[100];
		this.qtdCliente = 10;
	}
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String cadastroCliente(String nome,double valor,int id,double desconto){
		for(int i=0;i<qtdCliente-1;i++){
			if(this.desconto==0){
				clientes[i]= new Cliente(nome, valor, id);
				this.qtdCliente++;
				return "cliente normal";
			}else
				clientes[i]= new ClienteEspecial(nome, valor, id, desconto);
				this.qtdCliente++;
				return "cliente especial";
		}
		return "ERRO:Não foi possivel cadastrar";
	}


}
