/**
 * This program reads from a .csv file and writes to a .txt file
 * the contents of the .csv file
 *
 * @author      Harshitha Shreeka
 * @author      Ramitha 
 */

package commandline;
import java.io.*;
import java.util.Scanner;


public class asn2_5 {
	/**
	   * The main program.
	   *
	   * @param    args    command line arguments (ignored)
	   */
	public static String a;
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("/Users/Harshitha/popu1.csv")); //Reads from the .csv file 
        scanner.useDelimiter(",|\n"); //scans for a delimiter
        File StockOutputFile = new File("C://Users/Harshitha/output.txt"); //Creating an instance of the output file
        FileOutputStream fos = new FileOutputStream(StockOutputFile);
        PrintStream printStream = new PrintStream(fos);
        //Prints the contents to the new file till the end of file is reached 
        while(scanner.hasNextLine()){
        	      	
            printStream.print("The capital of  "+scanner.next()+" is "+scanner.next()+" with the population of  "+scanner.next()+" and the language spoken is "+scanner.next()+".\n");
        }
        scanner.close();
        log.logging("-l");//Calling the log class
	}

}
        	      	
        	      	      	
        	
        	
        	
        	
        	   
 