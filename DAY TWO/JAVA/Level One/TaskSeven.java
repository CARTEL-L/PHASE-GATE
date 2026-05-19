
import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);
 System.out.print("Enter radius: ");
int radius = inputCollector.nextInt();
double pi = 22/7;
 double newPi = 2 * pi;
double circumference = newPi * radius;
System.out.println("The circumference is " + circumference);


}

}
