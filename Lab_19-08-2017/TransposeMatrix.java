import java.util.Scanner; 

public class TransposeMatrix {
	
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
		int transposeMatrix[][] = new int[column][row];
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				transposeMatrix[i][j] = matrix[j][i];
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}	
			System.out.println("");
		}
	}
}
