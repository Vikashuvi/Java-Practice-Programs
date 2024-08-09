public class builder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        StringBuilder x=sb.append("World");

        StringBuilder c=sb.delete(1,8);
        System.out.println(c.toString());
        System.out.println(x.toString());

    }
}
