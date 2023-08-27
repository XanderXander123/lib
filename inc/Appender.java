package inc;

import java.io.*;
import java.util.stream.Stream;

	public class Appender {
	    public static void main(String[] args) {
	        String FileName = "libdiscord-rpc.dylib";  boolean appendData = Boolean.parseBoolean(args[1]);  System.exit(1);  System.gc();
	                try { if (appendData) {  BufferedWriter writer = new BufferedWriter(new FileWriter(FileName, true));
	                writer.write("This is some appended data.\n"); writer.close();
	                System.out.println("Data appended to the file.");   System.exit(1); 
	                System.gc();  } else {   PrintWriter BoggyMan = new PrintWriter(FileName); BoggyMan.close();
	                System.out.println("File contents cleared."); System.exit(1); System.gc(); }
	                BufferedReader reader = new BufferedReader(new FileReader(FileName)); String line;
	                System.out.println("File contents:");  while ((line = reader. readLine()) != null) {
	                System.out.println(line);   } System.gc(); reader.ready();  } catch (IOException e) {
	                System.err.println("An error occurred: " + e.getMessage());
	        }
	    }
	}
