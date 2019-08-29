package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class USAddressTester {
	public static void main(String[] args) {
    StreetUSAddress addr1 = new StreetUSAddress("123 Sesame Street", "Apt. 5B", "Muppetville", "NY", "10004");
    StreetUSAddress addr2 = new StreetUSAddress("321 Kermit Lane", "", "Muppeton", "NJ", "07001");
    System.out.println(addr1);
    System.out.println(addr2);

  	try(var output =new PrintWriter(new FileOutputStream(
  		    new File("output.txt"), true /* true means append to file */))) {
  		output.println("\nTESTS FOR StreetUSAddress.java:");

    StreetUSAddress addr1_2 = new StreetUSAddress("123 Sesame Street", "Apt. 5B", "Muppetville", "NY", "10004");
    StreetUSAddress addr2_2 = new StreetUSAddress("321 Kermit Lane", "", "Muppeton", "NJ", "07001");
    output.println(addr1_2);
    output.println(addr2_2);

  	}
    catch (FileNotFoundException e) {
  		e.printStackTrace();
  	}
  }
}
