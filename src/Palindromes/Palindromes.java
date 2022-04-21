package Palindromes;

import ReverseString.ReverseString;

public class Palindromes {

    public static boolean palindrome_0(String str)
    {
        String reverse = ReverseString.reverse_2(str);
        return reverse.equals(str);
    }

    public static boolean palindrome_1(String str) {
        char[] chars = str.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i <= (chars.length / 2); i++) {
            if (chars[i] == chars[chars.length - i - 1])
                isPalindrome = true;
            else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
    public static  void main(String[] args)
    {
        System.out.println("is Palidrome: "+palindrome_1("abba"));
        System.out.println("is Palidrome: "+palindrome_1("abcba"));
        System.out.println("is Palidrome: "+palindrome_1("abcdefg"));
    }

}
