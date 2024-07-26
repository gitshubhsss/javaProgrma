import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        int matrix[][]=new int[3][4];

        int total_number_of_columns=matrix[0].length;
        int total_number_of_rows=matrix.length;
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix");

        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_columns;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        int  i=0;
        int row=0;
        int col=0;
        while (i<1) {
            //print first row
            for(row=0;row<1;row++){
                for(col=0;col<total_number_of_columns;col++){
                    System.out.print(matrix[row][col]+" ");
                }
            }
            
            for(row=1;row<total_number_of_rows;row++){
                col=total_number_of_columns-1;
                System.out.print(matrix[row][col]+" ");
            }

            row=total_number_of_rows-1;
            for(col=total_number_of_columns-2;col>=0;col--){
                row=total_number_of_rows-1;
                System.out.print(matrix[row][col]+" ");
            }

            for(row=total_number_of_rows-2;row>=1;row--){
                col=0;
                System.out.print(matrix[row][col]+" ");
            }

            for(col=1;col<=total_number_of_columns-2;col++){
                row=1;
                System.out.print(matrix[row][col]+" ");
            }
          
            for(col=total_number_of_columns-2;col>=0;col--){
                row=total_number_of_rows-2;
                System.out.print(matrix[row][col]+" ");
            }
            i++;
        }

    }
}
