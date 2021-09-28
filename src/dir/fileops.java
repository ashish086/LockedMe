package dir;
//import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException; 
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.*;
public class fileops  {
	public static void createfiles(String filename)  {
			
			filename = filename+".txt";
			Path path = Paths.get("./directed/"+filename);
			
			 try{
				 Files.createDirectories(path.getParent());
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
			
			 
		           
		  }
	public static void deletefiles(String filename) {
		//Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter a filename to delete");
		System.out.println();
		String filename = sc.nextLine();*/
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
	        //sc.close();
	}
	public static void searchfiles(String filename)  {
		File directory = new File("./directed");
		String[] flist = directory.list();
		int flag = 0;
		//Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the file name to be searched in the directory");
		System.out.println();
		String searchname = sc.nextLine();
		*/
		if (flist == null) {
            System.out.println("Empty directory.");
        }
		else {
			for (int i=0;i<flist.length;i++) {
				String name = flist[i];
				if(name.equals(filename)) {
					System.out.println(name+"found at :"+directory);
					flag = 1;
				}
				
			}
		}
		if(flag == 0) {
			System.out.println("File not found");
		}
		
		
		
		
	}
	

}
