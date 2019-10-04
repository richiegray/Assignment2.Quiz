package assignment2;

//have to import a Scanner to collect data entered by the user
import java.util.Scanner;
public class Assignment2 {

    
    public static void main(String[] args) {
        //to keep track of our answers
        int b = 0;
        // int d = 0;    (this is used to collect the wrong answers
        // creating the scanner to collect input
        Scanner scan = new Scanner( System.in);
        // Declare the object and initialize with 
        // predefined standard input object 
        
        
        System.out.println("Are you ready to take this quiz? Please enter 'yes' for Yes or 'no' for No:");
        // declares the input in the next line will be a string
        String in;
        in = scan.nextLine();
     if (in.equalsIgnoreCase("YES") || in.equalsIgnoreCase("Y")){
         System.out.println(" \nLet's start");
     }else{
         System.out.println(" \nLet's start anyways...\n\n");
     }

        // Question 1
    System.out.println(" \n\n01) If Distance(meters) = Speed(meters/Second) x Time(Seconds):\nWhat Distance was traveled if "
                + "you are going 8m/s for 140s?\n ");
    System.out.println("\t1) 1120m\n\t2) 980m\n\t3) 1140m\n\t4) 1200m\n");
        // I used the string becuase troubles where had when using Int with the if/else statements
        
        in = scan.nextLine();
        // can use the or statment to help eliminate errors
        if (in.equals("1") || in.equals("1)") || in.equals("1.")){
            System.out.println("Correct\n\n");
            b++;
        }else{
            System.out.println("Wrong answer 1 is correct\n\n");
            //d++;  (this would be used to collect the number of wrong answers
        }
        
        //Question 2
        
    System.out.println("02) What language is this coded in? (please type the name and hit 'Enter')\n\tJava\n\tJavaScript\n\tPython\n\tC++");
        
        
        // again in represents the input as a string that the user enters
        in = scan.nextLine();
        //the equalsIgnoreCase allows you to input Java or java and get a correct answer
            if (in.equalsIgnoreCase("java")){
                System.out.println("Correct\n\n");
                b++;
            }else{
                System.out.println("Wrong it is coded in Java\n\n");
        }
            
        //Question 3
        
    System.out.println("03) What is the Capital of Canada?\n\t1) Victoria\n\t2) Ottawa\n\t3) Toronto\n\n ");

        in = scan.nextLine();
            if (in.equals("2")){
                System.out.println("Correct\n\n");
                b++;
            }else{
                System.out.println("Wrong Ottawa is the Capital of Canada\n\n");
    }
    
            //Question 4
            
    System.out.println("04) Who was the first Prime Minister of Canada?\n\t1) Alexander Mackenzie\n\t2) John Abbott\n\t"
                + "3) John Macdonald\n\t4) Pierre Trudeau\n\n");
        in = scan.nextLine();
            if (in.equals("3")){
                System.out.println("Correct");
                b++;
            }else{
                System.out.println("Wrong, you ment to put John Macdonald. ");
               }
        
     
      System.out.println(" \nYou got " + b + " out of 4 Correct");
      //math for the percent b = amount answered correct, 4 is the total number of questions
      //if I kept track of the wrong answers I would be able to create a formual/function where inplace of 4 it would be
      // the total of the correct and wrong answers
      // double per = ((b * 100) / (b + d)); (if added all the wrong answers you can simply add or delete answers with ease
      double per = ((b * 100) / (4));
      System.out.println(" \nYou got " + per +"%");
    }
    
}
