package ReverseInt;

public class ReverseInt {

    public static int reverseInt_0(int number)
    {
        int j =10;
        int reverse = 0;
        while(number != 0)
        {
            reverse = (reverse*10)+(number % j);
            number = number / j;

        }
        return reverse;
    }

    public static void main(String[] args)
    {
        System.out.println("Reversing 512: "+reverseInt_0(512));
        System.out.println("Reversing 189: "+reverseInt_0(189));
        System.out.println("Reversing 500: "+reverseInt_0(500));
        System.out.println("Reversing -91: "+reverseInt_0(-91));
        System.out.println("Reversing -90: "+reverseInt_0(-90));
        System.out.println("Reversing -15: "+reverseInt_0(-15));
    }
}
