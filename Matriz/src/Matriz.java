import javax.swing.JOptionPane;


public class Matriz {
	
	int values[][] = new int[4][4];
	int j,i;

	public void geraMatriz(){
		for(i =0;i<4;i++){ 
			for(j=0;j<4;j++){
				values[i][j]=(int)(Math.random()*5);
				System.out.print(values[i][j]+" ");
			}	
			System.out.println("");
		}
	}

	public static void main(String[]args){
		Matriz matriz = new Matriz();
		matriz.geraMatriz();
	}
}
