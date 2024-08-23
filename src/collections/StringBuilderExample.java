package collections;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("sd");
        sb.append('s');
        sb.setCharAt(0, 'x');
        sb.reverse();
        sb.deleteCharAt(0);
        sb.charAt(0);
        sb.replace(0,1,"C");
        System.out.println(Integer.parseInt("23892839239283923"));
        System.out.println(sb.toString());
        System.out.println(myAtoi("   -042"));
    }

    public static int myAtoi(String s) {
        String str = s.trim();
        boolean isPos = true;
        boolean numberFound = false;
        StringBuilder res = new StringBuilder();

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            char c = arr[i];
            if(c==' ' || c=='.') {
                break;
            } else if(c=='-') {
                if(numberFound) {
                    break;
                }
                isPos = false;
            } else if(c=='+') {
                if(numberFound) {
                    break;
                }
            } else {
                numberFound = true;
                res.append(c);
            }
        }

        int result = isPos ? 1 : -1;

        result*= res.toString().length()==0 ? 0 : Integer.parseInt(res.toString());

        return result;

    }
}
