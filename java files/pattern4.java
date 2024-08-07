public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if (j==n-1) {
                    System.out.print(num);
                }else{
                    System.out.print(num+ "*");
                }
                num++;
            }
            
            System.out.println("");
        }
    }
}
