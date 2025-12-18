public class ToggleCase {
    public static void main(String[] args) {
        String s = "Java ProGRam";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }
        System.out.println(result);
    }
}
/*
out put
  jAVA pROgrAM
  */
