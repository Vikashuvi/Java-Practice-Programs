
import java.util.*;


public class grade {
    public static void main(String[] args) {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks");
        int s1;
        s1=sc.nextInt();
        
        int avg=(s1);
        if(avg>=91 && avg<=100){
            System.out.println("Grade A");
        }else if(avg>=81 && avg<=90){
            System.out.println("Grade B");
        }else if(avg>=71 && avg<=80){
            System.out.println("Grade C");
        }else if(avg>=61 && avg<=70){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }


        
    }
}
