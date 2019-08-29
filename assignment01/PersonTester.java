package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class USAddressTester {
	public static void main(String[] args) {
    Person john = new Person("John", "Smith", "222-33-4444",
     new DateAndPlaceOfBirth(1967, 4,3, "Binghamton", "NY", "USA"),
     new StreetUSAddress("999 Street Street", "Apt. 7C", "Chicago", "IL", "59922"));

    System.out.println(john);
  }
}
