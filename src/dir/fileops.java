package dir;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class fileops {
	public static void createfiles() throws IOException{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the filenemae you want to add in directed folder");
			System.out.println();
			String filename = sc.nextLine();
			filename = filename+".txt";
			
			Path path = Paths.get("./directed/"+filename);
			Files.createDirectories(path.getParent());
			 try{
				 Files.createFile(path);
				 System.out.println(filename + " created successfully");
			 }
			 catch(FileAlreadyExistsException e) {
				 System.err.println("already exists: " + e.getMessage());
			 }
			 catch(IOException op) {
				 System.err.println("Check: " + op.getMessage());
			 }
			 sc.close();
		           
		            
		
	}
	

}
