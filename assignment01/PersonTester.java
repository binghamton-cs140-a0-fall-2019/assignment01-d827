package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PersonTester {
	public static void main(String[] args) {
    Person john = new Person("John", "Smith", "222-33-4444",
     new DateAndPlaceOfBirth(1967, 4,3, "Binghamton", "NY", "USA"),
     new StreetUSAddress("999 Street Street", "Apt. 7C", "Chicago", "IL", "59922"));

    System.out.println(john);

		try(var output =new PrintWriter(new FileOutputStream(
			new File("output.txt"), true /* true means append to file */))) {
				output.println("\nTESTS FOR Person.java:");

		Person john_2 = new Person("John", "Smith", "222-33-4444",
     new DateAndPlaceOfBirth(1967, 4,3, "Binghamton", "NY", "USA"),
     new StreetUSAddress("999 Street Street", "Apt. 7C", "Chicago", "IL", "59922"));

    output.println(john_2);

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
