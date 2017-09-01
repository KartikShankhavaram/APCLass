import java.util.Scanner; 

public class Multiplication {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int row1 = in.nextInt();
		int	column1 = in.nextInt();
		int matrix1[][] = new int[row1][column1];
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < column1; j++) {
				matrix1[i][j] = in.nextInt();
			}
		}
		int row2 = in.nextInt();
		int	column2 = in.nextInt();
		int matrix2[][] = new int[row2][column2];
		for(int i = 0; i < row2; i++) {
			for(int j = 0; j < column2; j++) {
				matrix2[i][j] = in.nextInt();
			}
		}
		if(column2 != row1) {
			System.out.println("Matrices can't be multiplied, exiting program...");
			System.exit(0);
		}
		int result[][] = new int[row1][column2];
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < column2; j++) {
				for(int k = 0; k < row2; k++) {
					result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < column2; j++) {
				System.out.print(result[i][j] + " ");
			}	
			System.out.println("");
		} 
	}
}
