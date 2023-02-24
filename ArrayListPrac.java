import java.util.*;
public class ArrayListPrac{
    public static void main(String[] args){
        ArrayList<String>myList;
        //i can tell the type of object that the arraylist will hold
        //when you print out the arraylist, it will give you an id for the arraylist but not its contents
        //you can call fucntions on an arraylist as that is how you access the contents of the arraylist
        myList = new ArrayList<String>();

        //the size function of an arraylist differs from the size of array as the size of an array is an attribute while the arraylist size is not and must be accessed through a function.
        myList.add("Harry Potter");
        myList.add("Ron Weasley");
        myList.add("Hermione Granger");
        myList.add("Cloak of Invisibility");
        myList.add("Soul Stone");

        myList.remove(4);
        
        myList.set(1, "Voldemort");
        
        System.out.println(myList.get(0));

        myList.add(1, "Dobby");
        
    }
}