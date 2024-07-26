import java.util.Scanner;

public class search2d {

    public static boolean searchKey(int matrix[][],int key){
        int total_number_of_rows=matrix.length;
        int total_number_of_columns=matrix[0].length;
        int maxElemet=Integer.MIN_VALUE;
        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_columns;col++){
                if(matrix[row][col]>maxElemet){
                    maxElemet=matrix[row][col];
                }
            }
        }
        System.out.println(maxElemet);
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int [3][4];

        int total_number_of_rows=matrix.length;
        int total_number_of_columns=matrix[0].length;
        System.out.println("Enter the elements in matrix");
        Scanner sc=new Scanner(System.in);
        
        for(int row=0;row<total_number_of_rows;row++){
            for(int col=0;col<total_number_of_columns;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        int key=8;
       System.out.println(searchKey(matrix, key));
    }
}
