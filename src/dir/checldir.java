
package dir;
import java.io.File;
import java.text.Collator;
import java.util.*;

public class checldir {
	public static void sortfiles() {
		/* This implementation can be used for taking user input for sorting the files in ascending order
		 * 
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the url where you want to sort the files in ascending order");
		System.out.println();
		String url_dir = sc.nextLine();
		File fileDir = new File(url_dir);
		*/
		
		File fileDir = new File(".\\forcheck");
		if(fileDir.isDirectory()){
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("The files present in the Directory are :");
			for(String s:listFile){
				System.out.println(s);
			}
			Collections.sort(listFile);
			//Collections.sort(listFile, Collator.getInstance(Locale.ENGLISH)); 
			//The above statement can be used when we want files with lowercase letters to be 
			//displayed before the uppercase
			
			System.out.println("**************************************");
			System.out.println("Sorting by filename in ascending order");
			for(String s:listFile){
				System.out.println(s);
			}
			

		}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			System.exit(0);
		}


	}
}
