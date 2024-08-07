public class array5 {
    public static void main(String[] args) {
        int[] arr={16,17,5,4,2};
        for (int i = 0; i < arr.length; i++) {
            for(int k=i+1;k<arr.length-1-i;k++){
                if(arr[i]<arr[k]){
                    break;
                }

                if(k==arr.length){
                    System.out.println(arr[i]);
                }
                
            }
            
        }
        // for(int j=0;j<arr.length;j++){
        //    System.out.print(arr[j]+" ");
        //}
    }
}
