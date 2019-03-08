package group3b;

import javax.swing.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        String name;
        String surname;
        String yesOrNo;
        int a = 0;
        int b = 0;
        boolean currentStudent = false;
        MathFormulas math = new MathFormulas();
        TryingToTimeOut evil = new TryingToTimeOut();

        Scanner console = new Scanner(System.in);

        System.out.print("Please enter the name of the Student > ");

        name = console.next();

        System.out.println("That's a really cool name!");

        System.out.println("Please enter the surname of the Student > ");

        surname = console.next();

        System.out.println("Is this student currently enrolled? (Y/N)");

        yesOrNo = console.next();

        if (yesOrNo.equalsIgnoreCase("Y")){
            currentStudent = true;
        }else if (yesOrNo.equalsIgnoreCase("N")){
            currentStudent = false;
        }else {
            System.out.println("You've entered an incorrect answer(OOPS), student set to not enrolled ");
            currentStudent = false;
        }

        Student student = new Student
                .Builder()
                .name(name)
                .surname(surname)
                .currentStudent(currentStudent)
                .build();

        System.out.println("Do you want to multiple two cool numbers together? (Y/N)");

        yesOrNo = console.next();

        if (yesOrNo.equalsIgnoreCase("Y")){
            System.out.println("Please enter the first number");
            a = console.nextInt();
            System.out.println("Please enter the second number");
            b=console.nextInt();

            System.out.println("Your number is : " + math.multiplication(a, b));


        }else if (yesOrNo.equalsIgnoreCase("N")){
            System.out.println("No maths then!");
        }else {
            System.out.println("You've entered an incorrect answer(OOPS), no multiplication for you");
        }

        System.out.println("Do you want to punish your computer until the end of time? (Y/N)");

        yesOrNo = console.next();

        if (yesOrNo.equalsIgnoreCase("Y")){
            evil.punishComputer();
        }else if (yesOrNo.equalsIgnoreCase("N")){
            System.out.println("Thanks for not punishing me");
        }else {
            System.out.println("You've entered an incorrect answer(OOPS)");
        }

    }
}
