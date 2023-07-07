package HW1;

public class Main 
{
    public static void main(String[] args) 
    {

        System.out.println("Start of Main");

        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)
        Pyramid pyramid = new Pyramid();

        // Call the getPyramidShape method and print the output

        for (String s : pyramid.getPyramidShape()) 
        {
            System.out.println(s);
        }
        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)
        Adlibs adlibs = new Adlibs("Garret Bobby Ferguson", 314, "Beige");
        {
            System.out.println("Hello. My name is " + adlibs.getName() +
                           ", and I am " + adlibs.getAge() + " years old" +
                           ", and my favorite color is " + adlibs.getFavoriteColor() + ".");
        }

        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
        Replace replace = new Replace();
        {
            System.out.println(replace.charReplace("I MAKE BREAD", 2, 'T'));
            //Thief 
        }
    }
}

