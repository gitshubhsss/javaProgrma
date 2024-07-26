import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];
        int total_number_of_rows = matrix.length;
        int total_number_of_columns = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int row = 0; row < total_number_of_rows; row++) {
            for (int col = 0; col < total_number_of_columns; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        int transpose[][] = new int[3][2];

        for (int row = 0; row < total_number_of_rows; row++) {
            for (int col = 0; col < total_number_of_columns; col++) {
                transpose[col][row] = matrix[row][col];
            }
        }

        for (int col = 0; col < total_number_of_columns; col++) {
            for (int row = 0; row < total_number_of_rows; row++) {
                System.out.print(transpose[col][row] + " ");
            }
            System.out.println();
        }
    }
}
