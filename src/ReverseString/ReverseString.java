package ReverseString;

public class ReverseString {

    public static String reverse(String input)
    {
        char[] ch = input.toCharArray();

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
        return new String(reverse);
    }

    public  static  String reverse_1(String input)
    {
        char[] ch = input.toCharArray();
        String reverse = "";
        for(char a:ch)
        {
            reverse = a+reverse;
        }
        return reverse;
    }

    public  static  String reverse_2(String input)
    {
        char[] ch = input.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(char a:ch)
        {
            reverse.insert(0,a);
        }
        return reverse.toString();
    }

    public static void main(String[] args)
    {
        /*reverse("Apple");
        reverse("hello");
        reverse("greetings");*/
       /* System.out.println("Reversing : "+reverse_1("apple"));
        System.out.println("Reversing : "+reverse_1("hello"));
        System.out.println("Reversing : "+reverse_1("greetings"));*/
        System.out.println("Reversing : "+reverse_2("apple"));
        System.out.println("Reversing : "+reverse_2("hello"));
        System.out.println("Reversing : "+reverse_2("greetings"));
    }
}
