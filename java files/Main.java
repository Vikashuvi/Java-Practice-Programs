import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		if(((x%4)==0) && ((x%3)==0)){
		    System.out.println("It is divisible by 3 and 4");
		}else{
		    System.out.println("It is not divisible by 3 and 4");
		}
	}
}