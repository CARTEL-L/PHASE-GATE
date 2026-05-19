import java.util.Scanner;
public class TaskSix{
 public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);

System.out.print("Enter number: ");
int number = inputCollector.nextInt();
for(int i = 1; i <= number; i++){
    int sum = number + i;



System.out.println(sum);
}

}


}
