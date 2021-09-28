package dir;
//import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.*;
public class fileops  {
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
				 System.out.println(filename + " has been created successfully");
				 System.out.println();
				// System.out.println("Do you want to add something ")
			 }
			 catch(FileAlreadyExistsException e) {
				 System.err.println("already exists: " + e.getMessage());
				 
			 }
			 catch(IOException op) {
				 System.err.println("Check: " + op.getMessage());
				 System.out.println(op.getClass().getName());
			 }
			 sc.close();
    
		           
		  }
	public static void deletefiles() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a filename to delete");
		System.out.println();
		String filename = sc.nextLine();
		Path path = Paths.get("./directed/"+filename);
		 try
	        {
	            Files.delete(path);
	        }
	        catch(NoSuchFileException e)
	        {
	            System.out.println("File Not Found(FNF)");
	        }
	        catch(DirectoryNotEmptyException e)
	        {
	            System.out.println("Directory is not empty.");
	        }
	        catch(IOException e)
	        {
	            System.out.println("Invalid permissions.");
	        }
	          
	        System.out.println("Deletion successful.");
	        sc.close();
	}
	public static void searchfiles()  {
		File directory = new File("./directed");
		String[] flist = directory.list();
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name to be searched in the directory");
		System.out.println();
		String searchname = sc.nextLine();
		if (flist == null) {
            System.out.println("Empty directory.");
        }
		else {
			for (int i=0;i<flist.length;i++) {
				String name = flist[i];
				if(name.equals(searchname)) {
					System.out.println(name+"found at :"+directory);
					flag = 1;
				}
				
			}
		}
		if(flag == 0) {
			System.out.println("File not found");
		}
		
		
		sc.close();
		
	}
	

}
