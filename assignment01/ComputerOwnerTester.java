package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class ComputerOwnerTester {
	public static void main(String[] args) {
    Person billy = new Person("Billy", "Johnson", "777-88-9999",
     new DateAndPlaceOfBirth(2001, 2, 6, "Toronto", "Canada"),
     new StreetUSAddress("583 Variable Street", "Apt. 1", "San Francisco", "CA", "92938"));

     ComputerOwner billy1 = new ComputerOwner(billy);
     Computer pc5 = new Computer("GenericPC", "Processes", 2, 120, false, 50.00);
     Computer pc6 = new Computer("PCLand", "Intel i7", 32, 2000, true, 1800.00);
     Computer pc7 = new Computer("PcVille", "AMD Ryzen", 16, 3000, false, 770.00);
     Computer pc8 = new Computer("Computer Company Inc.", "Intel i5", 8, 800, true, 450.00);

     billy1.addComputer(pc5);
     billy1.addComputer(pc6);
     billy1.addComputer(pc7);
     billy1.addComputer(pc8);

     System.out.println(billy1);

     billy1.removeComputer(0);
     billy1.removeComputer(2);

     System.out.println(billy1);

     try(var output =new PrintWriter(new FileOutputStream(
       new File("output.txt"), true /* true means append to file */))) {
         output.println("\nTESTS FOR ComputerOwnerTester.java:");

     Person billy_2 = new Person("Billy", "Johnson", "777-88-9999",
      new DateAndPlaceOfBirth(2001, 2, 6, "Toronto", "Canada"),
      new StreetUSAddress("583 Variable Street", "Apt. 1", "San Francisco", "CA", "92938"));

      ComputerOwner billy1_2 = new ComputerOwner(billy_2);
      Computer pc5_2 = new Computer("GenericPC", "Processes", 2, 120, false, 50.00);
      Computer pc6_2 = new Computer("PCLand", "Intel i7", 32, 2000, true, 1800.00);
      Computer pc7_2 = new Computer("PcVille", "AMD Ryzen", 16, 3000, false, 770.00);
      Computer pc8_2 = new Computer("Computer Company Inc.", "Intel i5", 8, 800, true, 450.00);

      billy1_2.addComputer(pc5_2);
      billy1_2.addComputer(pc6_2);
      billy1_2.addComputer(pc7_2);
      billy1_2.addComputer(pc8_2);

      output.println(billy1_2);

      billy1_2.removeComputer(0);
      billy1_2.removeComputer(2);

      output.println(billy1_2);

      }
      catch (FileNotFoundException e) {
        e.printStackTrace();
      }
  }
}
