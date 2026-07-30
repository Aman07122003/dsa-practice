import java.util.*;
public class reverseWords {
    public String helper (String s) {
        StringBuilder sc = new StringBuilder();
        int l = s.length() - 1;

        while(l >= 0) {
            while (l > 0 && s.chatAt(l) == " ") {
                l--;
            }
            if(l < 0) {
                break;
            }
            int end = l;
            while(l >= 0 && s.chatAt(l) != " ") {
                l--;
            }

            String st = s.substring(l + 1, end + 1);
            if(sc.length() > 0) {
                sc.append(" ");
            }
            sc.append(st);
        }
    }
    public static void main(String[] args) {
        String s = "My name is aman";
        String ans = s.helper(s);
        System.out.println(ans);
    }
}