import java.util.*;
public class removeTheOuterParenthesis {
    public String removeparenthesis( String s ) {
        int l = s.length();

        StringBuilder sb = new StringBuilder();
        int level = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                if(level > 0) {
                    sb.append(ch);
                    level++;
                }
            } else if(ch == ')') {
                level--;
                if(level > 0) {
                    sb.append(ch);
                }
            }
        }
        return result.toString;
    }
    public static void main(String[] args) {
        String s = ((()(())));
        String ans = removeParenthesis(s);
        System.out.println("The output String is : = " + ans);
    }
}