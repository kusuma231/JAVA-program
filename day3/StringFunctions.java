public class StringFunctions {
    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(1,3));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);
    }
}
/*
4
JAVA
a
av
dlroW olleH

*/
