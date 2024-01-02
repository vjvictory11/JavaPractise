package collections;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("sd");
        sb.reverse();
        sb.replace(0,1,"C");
        System.out.println(sb.toString());
    }
}
