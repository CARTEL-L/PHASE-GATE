import java.util.Scanner;
public class TaskSeven{
 public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);

for(int i = 1; i <= 5; i++){
System.out.print("Enter number: ");
int number = inputCollector.nextInt();
int sum = 0;
number++;
sum += number;

System.out.println(sum);

}
}


}
