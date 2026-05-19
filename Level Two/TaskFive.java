import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter number: ");
 int number = inputCollector.nextInt();
System.out.print("Enter second number: ");
int secondNumber = inputCollector.nextInt();
System.out.print("Enter third number: ");
int thirdNumber = inputCollector.nextInt();
int largest = number;
if(secondNumber > number && secondNumber > thirdNumber){
System.out.println(secondNumber + " is bigger");
}else if(thirdNumber > secondNumber && thirdNumber > number){
System.out.println(thirdNumber + " is bigger");
}else{
System.out.println(largest);
}




}



}
