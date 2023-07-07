package HW2;

import java.util.Scanner;

public class MathGames 
{
    
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)  
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5

    public static double pythagorean(double A, double B)
    {
        double C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        return C;
    }

        /* Ashhab Amin: return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        I'm gong to be honest, I let Copilot do this for me.
        From my limited knowledge with Math.pow and Math.sqrt, 
        I understand that Math.pow(a, 2) is a^2, and Math.pow(b, 2) is b^2.
        And Math.sqrt is the square root of the sum of a^2 and b^2. 
        */


    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(69.3) would return a D

    public static String grade(double grade)
    {
        String letterGrade;

        if(grade >= 90)
        {
            letterGrade = "A";
        }
        else if(grade >= 80)
        {
            letterGrade = "B";
        }
        else if(grade >= 70)
        {
            letterGrade = "C";
        }
        else if(grade >= 60)
        {
            letterGrade = "D";
        }else
        {
            letterGrade = "F";
        }
        if(grade >= 60)
        {
            System.out.println("You passed the class.");
        }else
        {
            System.out.println("You failed the class.");
        }
        return letterGrade;
    }
    /*Ashhab Amin: A rather simple grader. I've also implemented a check for whether the user has
     * passed or failed the class.
     */



    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    public static double tip(double totalBill, int people, int tipPercent){
        double tip = (totalBill * (tipPercent / 100.0)) / people;
        return Math.ceil(tip);
    }

    //Ashhab Amin: I also depended on Copilot for this one. I understand that the tip is the total bill.
    // I had trouble with the tipPercent, but I understand that it's the percentage of the total bill.


    // You can either create a tester class or put your code here
     public static void main(String[] args)
     {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        double A = input.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double B = input.nextDouble();
        System.out.println("Third Angle Result: " + pythagorean(A, B));

        System.out.println("Enter your grade: ");
        double grade = input.nextDouble();
        System.out.println("Your grade is: " + grade(grade));

        System.out.println("Enter the total bill: ");
        double totalBill = input.nextDouble();
        System.out.println("Enter the amount of people splitting the bill: ");
        int people = input.nextInt();
        System.out.println("Enter the percentage to tip: ");
        int tipPercent = input.nextInt();
        System.out.println("The tip per person is: " + tip(totalBill, people, tipPercent));
     }

}
