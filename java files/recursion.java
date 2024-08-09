public class recursion {

    public int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        recursion obj1=new recursion();
        int n=obj1.fact(5);
        System.out.println("factorial of 5 is "+n);
    }    
}
