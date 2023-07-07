import java.util.Scanner;

public class loopE 
{
    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3); // <- this should be changed 
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean result = loopE(str);
        System.out.println(result);
    }
}
