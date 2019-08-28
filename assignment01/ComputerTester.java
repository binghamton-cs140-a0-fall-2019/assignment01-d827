package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
    Computer pc1 = new Computer("CyberPower", "8-core 3.8 GHz", 16, 4000, true, 1500.00);
    Computer pc2 = new Computer("Asus", "Intel i5", 8, 512, true, 800.00);
    Computer pc3 = new Computer("Acer", "AMD Ryzen 5", 8, 2048, false, 750.00);
    Computer pc4 = new Computer("Dell", "Intel i3", 4, 768, false, 300.00);
    System.out.println(pc1);
    System.out.println(pc2);
    System.out.println(pc3);
    System.out.println(pc4);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
      
    Computer pc1_2 = new Computer("CyberPower", "8-core 3.8 GHz", 16, 4000, true, 1500.00);
    Computer pc2_2 = new Computer("Asus", "Intel i5", 8, 512, true, 800.00);
    Computer pc3_2 = new Computer("Acer", "AMD Ryzen 5", 8, 2048, false, 750.00);
    Computer pc4_2 = new Computer("Dell", "Intel i3", 4, 768, false, 300.00);
    output.println(pc1_2);
    output.println(pc2_2);
    output.println(pc3_2);
    output.println(pc4_2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
