package ReverseString;

public class ReverseString {

    public static void reverse(String input)
    {
        char[] ch = input.toCharArray();
        for(int i = 0;i< ch.length;i++)
        {
            System.out.print(ch[i]);
        }

        char[] reverse = new char[ch.length];
        int pos = 0;
        for(int i = ch.length-1; i >= 0 && pos < ch.length; --i)
        {
            reverse[pos] = ch[i];
            ++pos;
        }
        System.out.println("\nReverse string");
        for(int i = 0;i< reverse.length;i++)
        {
            System.out.print(reverse[i]);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        reverse("Apple");
        reverse("hello");
        reverse("greetings");
    }
}
