import java.util.*;
public class greatest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a>b &&a>c) {
            System.out.println("A is greatest number");
        }else if(b>a && b>c){
            System.out.println("B is greatest number");
        }else{
            System.out.println("C is greatest Number");
        }
        
    }
}
