package commandline;
/**
 * This program creates a log file and prints
 * few events of the file
 *
 * @author      Harshitha Shreeka
 * @author      Ramitha 
 */
import java.io.*;
import java.util.logging.*;

import commandline.asn2_5;
 
public class log {
   private static final Logger logger = Logger.getLogger(asn2_5.class.getName());
 
   public static void logging(String str) throws IOException {
	   
      if(str=="-l"){
	   // Construct a default FileHandler.
      Handler fh = new FileHandler("C://Users/Harshitha/test.log", true);  // append is true
      fh.setFormatter(new SimpleFormatter());  // Set the log format
      // Add the FileHander to the logger.
      logger.addHandler(fh);
      // Set the logger level to produce logs at this level and above.
      logger.setLevel(Level.FINE);
 
      // Redirecting System.out and System.err
      PrintStream outPS =
      new PrintStream(
         new BufferedOutputStream(
            new FileOutputStream("C://Users/Harshitha/test.log", true)));  // append is true
      System.setErr(outPS);    // redirect System.err
      System.setOut(outPS);
 
      try {
         // Simulating Exceptions
         throw new Exception("Simulating an exception");
      } catch (Exception ex){
         logger.log(Level.SEVERE, ex.getMessage(), ex);
      }
      logger.info("This is a info-level message");
      logger.config("This is a config-level message");
      logger.fine("This is a fine-level message");
      System.out.println("Writing to System.out");
      System.err.println("Writing to System.err");
   
   }
   else
	   System.out.println("Log file Cannot be created");
   }

   }