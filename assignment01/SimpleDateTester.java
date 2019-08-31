package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class SimpleDateTester {
	public static void main(String[] args) {
    SimpleDate newdate = SimpleDate.of(2000,5,3);

		boolean test1 = newdate.before(SimpleDate.of(1998,2,3));
		boolean test2 = newdate.before(SimpleDate.of(2000,5,3));
		boolean test3 = newdate.before(SimpleDate.of(2019,6,8));
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);


		try(var output =new PrintWriter(new FileOutputStream(
			new File("output.txt"), true /* true means append to file */))) {
				output.println("\nTESTS FOR Person.java:");

		SimpleDate newdate_2 = SimpleDate.of(2000,5,3);

		boolean test1_2 = newdate_2.before(SimpleDate.of(1998,2,3));
		boolean test2_2 = newdate_2.before(SimpleDate.of(2000,5,3));
		boolean test3_2 = newdate_2.before(SimpleDate.of(2019,6,8));
		output.println(test1_2);
		output.println(test2_2);
		output.println(test3_2);

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
