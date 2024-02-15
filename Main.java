// Program 1 - Word/Character Count Program (To Complete)
//
// This program reads multiple lines of text from the keyboard and
// displays the number of words and the number of non-blank
// characters the text contains. 
// 
// REQUIRED INPUT: 
// Up to ten lines of text may be entered. To end the entry of
// text, enter an empty line of text.
//
// REQUIRED OUTPUT:
// Your output is to be displayed EXACTLY as given below:
//
// Number of Words: xx
// Number of Characters: xx
// 
// ASSUMPTIONS:
// You may assume that the lines of text entered contain only
// upper and lowercase letters, and punctuation characters
// comma, period and question mark.
// ---------------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // init
    int num_of_words;
    int num_of_characters;
    String current_line;
    boolean done = false;
    String[] lines = new String[10];
    Scanner input = new Scanner(System.in);
    
    // prompt for lines of text
    System.out.println("Enter text (max 10 lines");
    System.out.println("(Hit RETURN on empty line when done)");"

    current_line = input.nextLine();
    
    while(!done) {

      // determine the number of words in line


      // determine the number of characters in line


      // prompt for next line
      current_line = input.nextLine();

      // check if done
      if(current_line.length() == 0)
        done = true;
      }
      
   
    // display results
    System.out.println("Number of Words: " + num_of_words);
    System.out.println("Number of Characters: " + num_of_characters);
  }

  // -----------------------------------------------------------
     public static int numOfWords(String line) {
  // -----------------------------------------------------------
  // Returns the number of words contained in the line provided.
  // -----------------------------------------------------------
  // (TO COMPLETE)


      
   }
  // -----------------------------------------------------------
     public static int numOfCharacters(String line) {
  // -----------------------------------------------------------
  // Returns the number of characters in the provided line,
  // including punctuation characters, but not blank characters.
  // -----------------------------------------------------------
  // (TO COMPLETE)


       
   }
}