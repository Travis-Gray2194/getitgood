//Travis Gray GetitGotitGood Assignment
//Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Get it” instead of the number and for the multiples of five print “Got it'
// For numbers which are multiples of 10, print "Good".
// So  for numbers which are multiples of both three and five print “Get it Got it”.
// Numbers which are multiples of three, five and ten, print "Get it Got it Good"


import  java.util.Scanner;

public class getitgood {

    public static void main(String args[]) {
        int counter;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number");
        counter = keyboard.nextInt();

            if (counter % 10 == 0 && counter % 5 == 0 && counter % 3 == 0){
                System.out.print( " Get it" + " Got it" + " Good");}

           if  (counter % 5 == 0){ System.out.print(" Got it");}
           if(counter % 10 == 0) {System.out.print(" Good");}
           if (counter% 3==0){System.out.print(" Get it");}

    }
}

