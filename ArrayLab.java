import java.util.Arrays;

public class ArrayLab {
    public static void main(String[] args){

        //Declare an array called names
        String[] names = {"Kirk", "Robert", "James", "Lars"};

        //Declare an array called instrument and populate it
        String[] instrument = new String[4];
        instrument[0] = "guitar";
        instrument[1] = "bass guitar";
        instrument[2] = "lead guitar";
        instrument[3] = "drums";

        //Use a for loop to display the contents of the arrays to the user
        for (int i=0; i<=3; i++){
            System.out.println(names[i] + " plays " + instrument[i] + ".");

        } // end for loop

        //use a for each loop to iterate through the element in the array
        for(String name : names) {
            System.out.println("Band member's name: " + name);
        } // end for loop

        //Call printArray method to print out the instruments
        printArray(instrument);

        //Call sortArray method to get a sorted list of songs
        String[] songs = sortArray();
        System.out.println(Arrays.toString(songs));

    } //end method

    //method for sorting an array
    public static String[] sortArray() {
        //define an array of type string
        String[] songs = {"The Unforgiven", "Ride the lightning", "Master of Puppets"};

        //sort string array in alphabetical order or ascending order
        Arrays.sort(songs);

        return songs;


    } //end sortArray method

    //method for printing an array
    public static void printArray(String[] array) {

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + "\n");
        }
    } //end printArray method
} // end class
