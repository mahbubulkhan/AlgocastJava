package UniqueCharacters;

public class UniqueCharacters {
    public static boolean isUnique_0(String input)
    {
        if(input.length() > 256) return false;

        boolean[] char_set = new boolean[256];
        for(int i =0;i < input.length();i++)
        {
            int val = input.charAt(i);
            System.out.println(val);
            if(char_set[val])
                return false;
            char_set[val] = true;
        }
        return  true;
    }

    public static void main(String[] args)
    {
        System.out.println("Does Dog has unique Characters : "+isUnique_0("Ddog"));
        System.out.println("Does Abba has unique Characters : "+isUnique_0("Abba"));


    }
}
