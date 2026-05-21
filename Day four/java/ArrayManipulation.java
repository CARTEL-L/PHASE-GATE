import java.util.Arrays;
public class ArrayManipulation{
	public int[] manipulation(int[] arr){

			int numOne = 0;
			int numTwo = 0;
			
		int largest = arr[0];
		for (int count = 0; count < arr.length; count++) {
			
				if (arr[count] >= largest){
					largest = arr[count];
				}
			}	
				
				int target = largest;
		for (int counter = 0; counter < arr.length; counter++) {
			for (int count = 1; count < arr.length; count++) {
				if (arr[counter]+arr[count] == target) {
					numOne = arr[count];
					numTwo = arr[counter];
							
					}	
			}
						
			}
		
		int[] doubleSum = {numOne, numTwo};
						return doubleSum;
	


}

}