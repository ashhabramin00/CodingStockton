package HW1;
// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favorite color in a string format and an int format
// Hint2: You will need to return a string. You can concat the int variables and the string variables together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
public class Adlibs 
{
    // Create the fields for the persons name, age, and favorite color
    private String name;
    private int age;
    private String favoriteColor;

     
    public Adlibs(String name, int age, String favoriteColor) 
    {
        /*Create a constructor that accepts a name, age, and favorite color
        * private objects and sets the fields to the values passed in
        */
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }
    // Create a method that returns a string that is a story about the person
    public String getName() {
        return name;
    }
    // Create a method that returns the age
    public int getAge() {
        return age;
    }
    // Create a method that returns the favorite color
    public String getFavoriteColor() {
        return favoriteColor;
    }
}
