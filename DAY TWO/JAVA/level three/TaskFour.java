import java.util.Scanner;
public class TaskFour{
 public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter number: ");
int number = inputCollector.nextInt();
for(int i = 1; i <= 12; i++){
   int table = number * i;
    System.out.println(number + " x " + i + " = " + table);


}

}


}
