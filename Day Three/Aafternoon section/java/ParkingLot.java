//create a 2 by 2 array to represent your parking lot
//
//create a for loop to check for free spaces
//
//an if statement to confirm the status of the parking lot
//
//create a variable to signify the spaces that are free to signify the car to enter
//
//create another if statement to signify there is a free space
//
//create a variable that represents the car
//
//create another if statement to allow the car in if the above condition is true and by signifying the slot number
//
//create another for loop to loop through the current array 
//
//create an if statement to display the current status

//pseudocode is not working for me no more

import java.util.Arrays;
public class ParkingLot{
    public static int[] parking(int[] slot, int slotNumber){

        int[] parkingStatus = slot;
        slotNumber = slot[0];
        String car = "pending";
        String slotStatus = empty;
    for(int count = 0; count < slot.length; count++){

    if(slot[count] == 0){
    slotStatus = "empty";

}else if(slot[count] == 1){
    slotStatus+count = "occupied";

}if(slot[count] == 0 && slotNumber == slot[count]){
    car = parked;
}

}

    for(int counter = 0; counter < slot.length; counter++){
        parkingStatus = slot[counter];
}

    return parkingStatus;
}



        public static void main(String[] args){
    int[] park = {
                {1, 0}
                {0, 0}
};
    int parkNumber = park[8];
    System.out.println(Arrays.toString(parking(park)));

}





}




