public class array4 {
    public static void main(String[] args) {
        int[] arr={16,17,5,4,2};
        for (int i = 0; i < arr.length; i++) {
            for(int k=0;k<arr.length-1-i;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
            
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
