//collect user input in celsius
//
//convert to fahrenheit
//
//print out the result

import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);
 System.out.print("Enter temperature in celsius: ");
int celsius = inputCollector.nextInt();
 double fahrenheit = (celsius * 9/5) + 32;
System.out.println("The temperature converted to fahrenheit is " + fahrenheit);


}

}
