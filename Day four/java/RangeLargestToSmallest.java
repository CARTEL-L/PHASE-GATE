public class RangeLargestToSmallest{
	public int manipulation(int[] arr){

			int numOne = 0;
			int numTwo = 0;
			
		int largest = arr[0];
		for (int count = 0; count < arr.length; count++) {
			
				if (arr[count] >= largest){
					largest = arr[count];
				}
			}	

					int smallest = arr[0];
				for (int counter = 0; counter < arr.length; counter++) {

					if (arr[counter] <= smallest) {
						smallest = arr[counter];
						
					}
					
				}

				int number = 0;
				int[] smallLargest = {smallest, largest};
				for (int range = 0; range < smallLargest.length; range++) {
				 number = arr[range];
				
}

				return number;

		}

		public static void main(String[] args) {
			int[] arr = {1,2,3,4,7,3,9,4,5};
				System.out.println(manipulation(arr));
		}

	}