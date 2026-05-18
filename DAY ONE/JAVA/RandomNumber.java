import java.util.Random;
import java.util.Scanner;
public class RandomNumber{
  public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number(Enter 7 to start): ");
int start = inputCollector.nextInt();
int randomNum = 7;//randomCollector.nextInt();

while(true){
if(start != 7)break;
 System.out.print("Enter number: ");
int number = inputCollector.nextInt();

if(number <= randomNum){
System.out.println("Answer is higher");
}else if(number >= randomNum){
System.out.println("Answer is lower");
}else if(number < 0 && number > 100){
System.out.println("Bad trial");
}



if(number == randomNum)break;


}


}




}
