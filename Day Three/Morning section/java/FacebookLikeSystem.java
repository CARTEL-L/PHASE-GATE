import java.util.Arrays;
public class FacebookLikeSystem{
    public static String[] items(String[] likes){
String display = null;

  if(likes == null){
    display = null;

}if (likes == "Petter"){
    display = "Peter";

}if(likes == "Jacob" "Alex"){
    display = "Jacob and Alex like this";

}if(likes == "Max" "John" "Mark"){
    display = "Max, John and Mark like this";

}if(likes == "Alex" "Jacob" "Mark" "Max"){
    display = "Alex, Jacob and 2 others like this";
}

    return display;
}







    public static void main(String[] args){
    String[] likes = null;
System.out.println(Arrays.toString(items(likes)));
}











}
