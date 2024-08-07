import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int z=read.nextInt();
        int[][] arr= new int[z][z];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=read.nextInt();
            }
        }

        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr.length;y++){
                System.out.print(arr[x][y]+" ");    
            }
            System.out.println();
        }
        
    }
}
