package String;

import java.util.Scanner;

public class Palindrome {
    /*
     * <-------Two pointer Approach------------>
     * static boolean isPlaindrome(String str){
     * int i=0, j=str.length()-1;
     * while(i<j){
     * if(str.charAt(i)!=str.charAt(j))
     * return false;
     * i++;
     * j--;
     * }
     * return true;
     * }
     */
    // Recursive method
    static boolean isPlaindrome(String str) {
        return isPlaindrome(0, str.length() - 1, str);
    }

    static boolean isPlaindrome(int i, int j, String str) {
        if (i >= j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return isPlaindrome(i + 1, j - 1, str);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string::");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        if (isPlaindrome(str))
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
        sc.close();
    }
}