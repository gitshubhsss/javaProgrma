public class selectionSort {
    public static void selection(int arr[]){
        int n=arr.length;
        int i=0;
       while (i<n) {
            //consider the first element as smallest
            int smallest=i;

            for(int j=i;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            i++;
       }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    
    }
    public static void main(String[] args) {
            int arr[]={3,2,5,1,4};
            selection(arr);
    }
}
