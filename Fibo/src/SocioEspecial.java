
public class SocioEspecial extends SocioClube{
	private double desconto;
	
	public SocioEspecial(double desconto,int codCidade,int codCliente,double mensalidade){
		super(codCidade, codCliente, mensalidade);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
}
