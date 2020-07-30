package st1A;

//import java.util.*;


public class Main {
 public static void main(String[] args) {
     String S = "paizacoding";
     int n = 5;
     if (1 <= n && n <= 100 && n <= S.length() && S.length() <= 100) {
         System.out.println(S.substring(0, n));
     }
 }
}
