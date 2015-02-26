
public class SocioClube {
	
	private int codCidade;
	private int codSocio;
	private double mensalidade;
	
	public SocioClube(int codCidade,int codSocio,double mensalidade){
		this.codCidade = codCidade;
		this.codSocio = codSocio;
		this.mensalidade = mensalidade;
	}

	public int getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(int codCidade) {
		this.codCidade = codCidade;
	}

	public int getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	

}
