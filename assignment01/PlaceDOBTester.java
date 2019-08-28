package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
    //Testing objects and printing
    DateAndPlaceOfBirth dapob1 = new DateAndPlaceOfBirth(2000, 5, 3, "Poughkeepsie", "NY", "USA");
    DateAndPlaceOfBirth dapob2 = new DateAndPlaceOfBirth(1965, 4, 1, "Memphis", "TN", "USA");
    DateAndPlaceOfBirth dapob3 = new DateAndPlaceOfBirth(1984, 1, 2, "New York", "NY", "USA");
    DateAndPlaceOfBirth dapob4 = new DateAndPlaceOfBirth(2000, 5, 3, "London", "UK");
    DateAndPlaceOfBirth dapob5 = new DateAndPlaceOfBirth(1989, 5, 3, "Tokyo", "Japan");
    System.out.println(dapob1);
    System.out.println(dapob2);
    System.out.println(dapob3);
    System.out.println(dapob4);
    System.out.println(dapob5);

    //Testing .hasSameBirthDayAs()    All combinations
    System.out.println(dapob1.hasSameBirthDayAs(dapob2));
    System.out.println(dapob1.hasSameBirthDayAs(dapob3));
    System.out.println(dapob1.hasSameBirthDayAs(dapob4));
    System.out.println(dapob1.hasSameBirthDayAs(dapob5));
    System.out.println(dapob2.hasSameBirthDayAs(dapob3));
    System.out.println(dapob2.hasSameBirthDayAs(dapob4));
    System.out.println(dapob2.hasSameBirthDayAs(dapob5));
    System.out.println(dapob3.hasSameBirthDayAs(dapob4));
    System.out.println(dapob3.hasSameBirthDayAs(dapob5));
    System.out.println(dapob4.hasSameBirthDayAs(dapob5));

    //Testing .hasSameBirthDateAs()    All combinations
    System.out.println(dapob1.hasSameBirthDateAs(dapob2));
    System.out.println(dapob1.hasSameBirthDateAs(dapob3));
    System.out.println(dapob1.hasSameBirthDateAs(dapob4));
    System.out.println(dapob1.hasSameBirthDateAs(dapob5));
    System.out.println(dapob2.hasSameBirthDateAs(dapob3));
    System.out.println(dapob2.hasSameBirthDateAs(dapob4));
    System.out.println(dapob2.hasSameBirthDateAs(dapob5));
    System.out.println(dapob3.hasSameBirthDateAs(dapob4));
    System.out.println(dapob3.hasSameBirthDateAs(dapob5));
    System.out.println(dapob4.hasSameBirthDateAs(dapob5));

    //Testing .olderThan()    All combinations
    System.out.println(dapob1.olderThan(dapob2));
    System.out.println(dapob1.olderThan(dapob3));
    System.out.println(dapob1.olderThan(dapob4));
    System.out.println(dapob1.olderThan(dapob5));
    System.out.println(dapob2.olderThan(dapob1));
    System.out.println(dapob2.olderThan(dapob3));
    System.out.println(dapob2.olderThan(dapob4));
    System.out.println(dapob2.olderThan(dapob5));
    System.out.println(dapob3.olderThan(dapob1));
    System.out.println(dapob3.olderThan(dapob2));
    System.out.println(dapob3.olderThan(dapob4));
    System.out.println(dapob3.olderThan(dapob5));
    System.out.println(dapob4.olderThan(dapob1));
    System.out.println(dapob4.olderThan(dapob2));
    System.out.println(dapob4.olderThan(dapob3));
    System.out.println(dapob4.olderThan(dapob5));
    System.out.println(dapob5.olderThan(dapob1));
    System.out.println(dapob5.olderThan(dapob2));
    System.out.println(dapob5.olderThan(dapob3));
    System.out.println(dapob5.olderThan(dapob4));

    //Testing .youngerThan()   All combinations
    System.out.println(dapob1.youngerThan(dapob2));
    System.out.println(dapob1.youngerThan(dapob3));
    System.out.println(dapob1.youngerThan(dapob4));
    System.out.println(dapob1.youngerThan(dapob5));
    System.out.println(dapob2.youngerThan(dapob1));
    System.out.println(dapob2.youngerThan(dapob3));
    System.out.println(dapob2.youngerThan(dapob4));
    System.out.println(dapob2.youngerThan(dapob5));
    System.out.println(dapob3.youngerThan(dapob1));
    System.out.println(dapob3.youngerThan(dapob2));
    System.out.println(dapob3.youngerThan(dapob4));
    System.out.println(dapob3.youngerThan(dapob5));
    System.out.println(dapob4.youngerThan(dapob1));
    System.out.println(dapob4.youngerThan(dapob2));
    System.out.println(dapob4.youngerThan(dapob3));
    System.out.println(dapob4.youngerThan(dapob5));
    System.out.println(dapob5.youngerThan(dapob1));
    System.out.println(dapob5.youngerThan(dapob2));
    System.out.println(dapob5.youngerThan(dapob3));
    System.out.println(dapob5.youngerThan(dapob4));



    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

    DateAndPlaceOfBirth dapob1_2 = new DateAndPlaceOfBirth(2000, 5, 3, "Poughkeepsie", "NY", "USA");
    DateAndPlaceOfBirth dapob2_2 = new DateAndPlaceOfBirth(1965, 4, 1, "Memphis", "TN", "USA");
    DateAndPlaceOfBirth dapob3_2 = new DateAndPlaceOfBirth(1984, 1, 2, "New York", "NY", "USA");
    DateAndPlaceOfBirth dapob4_2 = new DateAndPlaceOfBirth(2000, 5, 3, "London", "UK");
    DateAndPlaceOfBirth dapob5_2 = new DateAndPlaceOfBirth(1989, 5, 3, "Tokyo", "Japan");
    output.println(dapob1_2);
    output.println(dapob2_2);
    output.println(dapob3_2);
    output.println(dapob4_2);
    output.println(dapob5_2);

    //Testing .hasSameBirthDayAs()    All combinations
    output.println(dapob1_2.hasSameBirthDayAs(dapob2_2));
    output.println(dapob1_2.hasSameBirthDayAs(dapob3_2));
    output.println(dapob1_2.hasSameBirthDayAs(dapob4_2));
    output.println(dapob1_2.hasSameBirthDayAs(dapob5_2));
    output.println(dapob2_2.hasSameBirthDayAs(dapob3_2));
    output.println(dapob2_2.hasSameBirthDayAs(dapob4_2));
    output.println(dapob2_2.hasSameBirthDayAs(dapob5_2));
    output.println(dapob3_2.hasSameBirthDayAs(dapob4_2));
    output.println(dapob3_2.hasSameBirthDayAs(dapob5_2));
    output.println(dapob4_2.hasSameBirthDayAs(dapob5_2));

    //Testing .hasSameBirthDateAs()    All combinations
    output.println(dapob1_2.hasSameBirthDateAs(dapob2_2));
    output.println(dapob1_2.hasSameBirthDateAs(dapob3_2));
    output.println(dapob1_2.hasSameBirthDateAs(dapob4_2));
    output.println(dapob1_2.hasSameBirthDateAs(dapob5_2));
    output.println(dapob2_2.hasSameBirthDateAs(dapob3_2));
    output.println(dapob2_2.hasSameBirthDateAs(dapob4_2));
    output.println(dapob2_2.hasSameBirthDateAs(dapob5_2));
    output.println(dapob3_2.hasSameBirthDateAs(dapob4_2));
    output.println(dapob3_2.hasSameBirthDateAs(dapob5_2));
    output.println(dapob4_2.hasSameBirthDateAs(dapob5_2));

    //Testing .olderThan()    All combinations
    output.println(dapob1_2.olderThan(dapob2_2));
    output.println(dapob1_2.olderThan(dapob3_2));
    output.println(dapob1_2.olderThan(dapob4_2));
    output.println(dapob1_2.olderThan(dapob5_2));
    output.println(dapob2_2.olderThan(dapob1_2));
    output.println(dapob2_2.olderThan(dapob3_2));
    output.println(dapob2_2.olderThan(dapob4_2));
    output.println(dapob2_2.olderThan(dapob5_2));
    output.println(dapob3_2.olderThan(dapob1_2));
    output.println(dapob3_2.olderThan(dapob2_2));
    output.println(dapob3_2.olderThan(dapob4_2));
    output.println(dapob3_2.olderThan(dapob5_2));
    output.println(dapob4_2.olderThan(dapob1_2));
    output.println(dapob4_2.olderThan(dapob2_2));
    output.println(dapob4_2.olderThan(dapob3_2));
    output.println(dapob4_2.olderThan(dapob5_2));
    output.println(dapob5_2.olderThan(dapob1_2));
    output.println(dapob5_2.olderThan(dapob2_2));
    output.println(dapob5_2.olderThan(dapob3_2));
    output.println(dapob5_2.olderThan(dapob4_2));

    //Testing .youngerThan()   All combinations
    output.println(dapob1_2.youngerThan(dapob2_2));
    output.println(dapob1_2.youngerThan(dapob3_2));
    output.println(dapob1_2.youngerThan(dapob4_2));
    output.println(dapob1_2.youngerThan(dapob5_2));
    output.println(dapob2_2.youngerThan(dapob1_2));
    output.println(dapob2_2.youngerThan(dapob3_2));
    output.println(dapob2_2.youngerThan(dapob4_2));
    output.println(dapob2_2.youngerThan(dapob5_2));
    output.println(dapob3_2.youngerThan(dapob1_2));
    output.println(dapob3_2.youngerThan(dapob2_2));
    output.println(dapob3_2.youngerThan(dapob4_2));
    output.println(dapob3_2.youngerThan(dapob5_2));
    output.println(dapob4_2.youngerThan(dapob1_2));
    output.println(dapob4_2.youngerThan(dapob2_2));
    output.println(dapob4_2.youngerThan(dapob3_2));
    output.println(dapob4_2.youngerThan(dapob5_2));
    output.println(dapob5_2.youngerThan(dapob1_2));
    output.println(dapob5_2.youngerThan(dapob2_2));
    output.println(dapob5_2.youngerThan(dapob3_2));
    output.println(dapob5_2.youngerThan(dapob4_2));
    }
    catch (FileNotFoundException e) {
    e.printStackTrace();
	  }
  }
}
