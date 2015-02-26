
public class Matriz {
	
	private int linha = 3;
	private int coluna = 3;
	private int matriz[][] = new int [linha][coluna];
	private int index = 0;
	
	public void montaMatriz(){
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				System.out.print(matriz[i][j]= 1);
				
			}
			System.out.println();
		}
	}

}
