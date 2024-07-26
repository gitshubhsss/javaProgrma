import java.util.Scanner;

public class darray{
    public static void main(String []args){
        int matrix[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        int total_number_of_rows=matrix.length ,total_number_of_columns=matrix[0].length;
        //accepting the matrix
        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_columns;col++){
                matrix[row][col]=sc.nextInt();
            }
        }

        //printing the matrix

        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_columns;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }



    }
}