public class LevelFourTask{
    public static int add(int numberOne, int numberTwo){
int sum = numberOne + numberTwo;
    return sum;

}



    public static int evenNumber(int number){
if(number%2 == 0){
System.out.println("Even");
}else if(number%2 != 0){
System.out.println("Odd");
}
    return number;

}


    public static int square(int number){
int square = number * number;

    return square;

}


    public static int largest(int numOne, int numTwo, int numThree){

int largest = numOne;
if(numTwo > numOne && numOne > numThree){
    largest = numTwo;
}else if(numThree > numTwo && numThree > numOne){
    largest = numThree;
}

        return largest;

}

    public static double triangleArea(int length, int width){

int area = length * width;

    return area;

}

    public static int[] reverse(int[] arr){

int frequency = 0;
for(int count = 0; count < arr.length; count++){
    for(int counter = count; counter < arr.length)

}
    
    return count;
}




public static void main(String[] args){
   int numOne = 8;
   int numTwo = 2;
int sum = add(numOne, numTwo);
System.out.println(sum);
int num = 3;
System.out.println(evenNumber(num));
int number = 3;
int result = square(number);
System.out.println(result);
int numberOne = 3;
int numberTwo = 5;
int numberThree = 7;
int bigest = largest(numberOne, numberTwo, numberThree);
System.out.println(bigest);
int length = 25;
int width = 15;
double areas = triangleArea(length, width);
System.out.println(areas);
int[] arrs = {1,2,3,4,5,6};
int[] reversed = reverse(int[] arrs);
System.out.println(reversed);
}

}
