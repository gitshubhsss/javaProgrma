public class insertionSort {
    public static void main(String[] args) {
        int n=10;
        //print the prime numbers till 10
        int count=0;
        int i=1;
        while (i<n) {
            for(int j=1;j<n;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            count=0;
            i++;
        }
    }
}
