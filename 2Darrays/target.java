import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int total_number_of_rows = matrix.length;
        int total_number_of_columns = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int row = 0; row < total_number_of_rows; row++) {
            for (int col = 0; col < total_number_of_columns; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        int target = 4;
        int row = 0;
        int col = total_number_of_columns - 1;
        while (row < total_number_of_rows && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("target found");
                break;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        
    }
}
