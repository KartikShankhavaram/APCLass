import java.util.Scanner; 

public class DiagonalMatrix {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int	column = in.nextInt();
		int matrix[][] = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int max = (row < column)?row:column;
		for(int i = 0; i < max; i++) {
			System.out.print(matrix[i][i] + " "); 		
		}

	}
}
