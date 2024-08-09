
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1="TAC";
        String s2="ACT";
        char[] arr=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        if(s1.length() == s2.length()){
            Arrays.sort(arr);
            Arrays.sort(arr2);

            if(Arrays.equals(arr,arr2)){
                System.out.println("Its a anagram");
            }else{
                System.out.println("Its not a anagram");
            }

        }else{
            System.out.println("Not");
        }
    }
}
