

public class fibo {
    public static void main(String[] args){
        int x=5;

        int f=0;
        int s=1;
        int fib=0;
        for(int i=1;i<x;i++){
            fib=f+s;
            f=s;
            s=fib;

        }
        System.out.println(fib);
    }
}
