
public class Mtriz {
	int linha;
	int coluna;
	String matrizLinha[][];
	String matrizColuna[][];
	public Mtriz(){
		this.linha = 3;
		this.coluna = 3;
		this.matrizLinha = new String [linha][coluna];
		this.matrizColuna = new String [linha][coluna];
	}
	public void geraLinha(){
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matrizLinha[i][j]= "---";
				System.out.print(matrizLinha[i][j]);
				geraColuna();
			}
			System.out.println();
		}
	}
	public void geraColuna(){
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matrizColuna[i][j]= "|";
				System.out.print(matrizColuna[i][j]);
			}
		}
	}
	public static void main(String args[]){
		Mtriz m = new Mtriz();
		m.geraLinha();
		m.geraColuna();
	}
}
