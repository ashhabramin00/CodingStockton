package HW1;
// Make a method that accepts a string an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,'T')
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace 
{
    public String charReplace(String s, int x, char z) 
    {
        // Create a string that is the first part of the string
        // ie if the string is "I MAKE BREAD" and the index is 2 it should return "I MA"
        String makeBread = s.substring(0, x);
        // Create a string that is the second part of the string
        // ie if the string is "I MAKE BREAD" and the index is 2 it should return "KE BREAD"
        String indexString = s.substring(x + 1);
        // Create a string that is the char converted to a string
        // ie if the char is 'T' it should return "T" 
        String charT = Character.toString(z);
        // Return the first part of the string + the char + the second part of the string

        //This class should accept "I MAKE BREAD", index by 2 where "M" is, 
        //and replace it with "T" to return "I TAKE BREAD"
        return makeBread + charT + indexString;
    } 
}
