import java.io.*;
import java.util.*;

public class GMUEventTracker {

    public static String[] readCSV(String fileName){
        /*This method will read a CSV file and write into a string array*/
        int count = 0;
        List<String> lines = new ArrayList<>();
        String allEvents[] = {};

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){ //Create Buffered reader and check for exceptions
            String line;
            line = reader.readLine(); //Skip over first line of CSV file
            while ((line = reader.readLine()) != null){ //Assign the string line with the current value of our reader and loops until it reaches null
                String[] currentEvent = line.split(",");
                System.out.println(currentEvent[0] + ": " + currentEvent[7] + "\nDate: " + currentEvent[3] + "\nTime: " + currentEvent[4] + "\nCurrent Attendance: " + currentEvent[5] + "\nOpen Slots: " + currentEvent[6] + "\nLocation: " + currentEvent[2]);
                System.out.println();
                lines.add(line);
                allEvents = lines.toArray(new String[count]);
                count++;
            }
        }
        catch(FileNotFoundException fnfe){ //Check if there is a file available
            System.out.println("File not found, please try again.");
        }
        catch(IOException ioe){ //Check if there is an input/output exception
            System.out.println("Input/output error, please try again.");
        }
        return allEvents;
    }

    public static void eventSelector(String campusEvents[]){
        /*This method will take our array of campus events as inputs and loop while user is selecting an event*/
    }

    public static void main(String args[]){

        String fileName = "GMUEvents.csv"; //Define the filename to be opened
        String allEvents[] = readCSV(fileName); //Uses read CSV function to get an array of all the events

        /*Open a CSV File
        Read CSV file into array making sure to include the index number so that users can select it, Array will be of type string
        Show top trending events at the top by assigning them trending boolean value true
        Show rest of the available events
        While true, scan a user integer
        Use integer to register user for the event they are interested in, only let student enroll once using true/false boolean
        Use a Try/Exception for all invalid inputs (out of range, not an int)
        If valid input is given give user feedback that they have succesfully registered for desired event, if invalid display error
        */
    } 
}