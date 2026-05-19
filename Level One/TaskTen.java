//colect 3 numbers from the user
//
//create a variable to get the sum
//
//create a variable to get the average
//
//print out the average

import java.util.Scanner;
public class TaskTen{
    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);
 System.out.print("Enter number: ");
int number = inputCollector.nextInt();
 System.out.print("Enter second number: ");
int secondNumber = inputCollector.nextInt();
 System.out.print("Enter thir number: ");
int thirdNumber = inputCollector.nextInt();
 int sum = number + secondNumber + thirdNumber;
int average = sum / 3;
System.out.println("The average is " + average);


}

}
