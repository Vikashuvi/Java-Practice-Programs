
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] arr= new int[4];
        Scanner read = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=read.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
