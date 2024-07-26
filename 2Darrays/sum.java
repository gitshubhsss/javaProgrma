import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int matrix[][]=new int [3][3];

        int total_number_of_rows=matrix.length;
        int total_number_of_columns=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_columns;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        int sum=0;
            for(int col=0;col<total_number_of_columns;col++){
                sum=sum+matrix[1][col];
            }
           
        
        System.out.println("sum of second row  : "+sum);
    }
}
