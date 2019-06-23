package ch04pc05;
import java.util.Scanner;

/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose: count the number of times a letter appears in a name
 */
public class Ch04pc05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String countName;
        char letter, temp;
        int i, charCount = 0;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter a name: ");
        countName = keyboard.nextLine();
        System.out.print("Please enter a character to count: ");
        letter = keyboard.next().charAt(0);
        
        //Calculations and output
        for (i = 0; i < countName.length(); i++)
        {
            temp = countName.charAt(i);
            
            if(temp == letter)
                charCount++;
        }
        System.out.println("There are " + charCount + " instances of letter " + letter + " in the word " + countName + ".");
        
    }
    
}
