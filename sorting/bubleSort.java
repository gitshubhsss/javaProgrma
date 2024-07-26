public class bubleSort{
    public static void buble(int arr[]){
        int n=arr.length;

        //outer loop for iteration

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swapping of elements is happening here
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,1,3,2,4};

        buble(arr);
    }
}