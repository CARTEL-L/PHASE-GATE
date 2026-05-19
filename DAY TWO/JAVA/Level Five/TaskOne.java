import java.util.Arrays;
public class TaskOne{
    public static int[] sorting(int[] arr){
    //int[] arr = {5,9,3,6,2};
int temp = 0;
  for(int count = 0; count < arr.length; count++){
    for(int counter = 0; counter < arr.length-2; counter++){
    temp = arr[counter];
    arr[counter] = arr[counter+1];
    arr[counter+1] = temp;  
}    

}

    for(int count = arr.length-1; count > 0; count--){
    if(arr[count]%2 != 0){
    
    
       return arr[count]; 
}
}
}


    public static int[] negativeSub(int[] arrs){
    int temp = 0;
    for(int count = 0; count > arr.length; count++){
    if(arr[count] < 0){
    arr[count] = temp;
    
       return arr[count]; 
}
}










    public static int[] sortingZero(int[] arr){
    
int temp = 0;
  for(int count = 0; count < arr.length; count++){
    for(int counter = 0; counter < arr.length-2; counter++){
    temp = arr[counter];
    arr[counter] = arr[counter+1];
    arr[counter+1] = temp;  
}    

}

    for(int count = arr.length-1; count > 0; count--){    
    
       return arr[count];
}
}







    public static void main(String[] args){

     int[] arr = {5,9,3,6,2};
System.out.println(Arrays.toStrings(sorting(arr)));
int[] array = {5,0,3,0,2,0};
System.out.println(Arrays.toString(sortingZero(array)));
}
}
