import java.util.Scanner;
public class StringUtil 
{

    public static String removeZ(String str) {
        if (str.length() < 3) {
            return str;
        }
        
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);
        String middle = str.substring(1, str.length() - 1).replace("z", "");

        return first + middle + last;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = "abczdefzghi";
        String result = removeZ(str);
        System.out.println(result); // Output: abcdedefghi
        System.out.println("Enter a string: ");
        str = scan.nextLine();
        result = removeZ(str);
        System.out.println(result);
    }
}