package dir;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class menus {
	public static void menuslists() {
		boolean chk = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				welcome_menu.menu();
				System.out.println();
				int opt = sc.nextInt();
				switch(opt) {
				case 1 :
					checldir.sortfiles();
					break;
				case 2:
					menus.subfilemenu();
					break;
				case 3:
					System.out.println("Program Terminated Successfully");
					chk = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please enter a valid option");
				}
			}
			catch(Exception e) {
				System.out.println(e.getClass().getName());
				
			}
			
		}
		while(chk==true);
	}
	public static void subfilemenu() {
		boolean chk = true;
		Scanner sc = new Scanner(System.in);
		welcome_menu.fileoptions();
		System.out.println();
		int ch = sc.nextInt();
		
		do {
			try {
				/*welcome_menu.fileoptions();
				System.out.println();
				int ch = sc.nextInt();*/
				switch(ch) {
				case 1:
					System.out.println("Enter the file name");
					//System.out.println();
					String filename = sc.next();
					 
					fileops.createfiles(filename);
					//subfilemenu();
					return;
					
				case 2:
					System.out.println("Enter a filename to delete");
					String delname = sc.next();
					fileops.deletefiles(delname);
					//subfilemenu();
					return;
				case 3:
					System.out.println("Enter the file name to be searched in the directory");
					String searchname = sc.next();
					
					fileops.searchfiles(searchname);
					return;
				case 4:
					menuslists();
					break;
				case 5:
					System.out.println("Program Terminated Successfully");
					sc.close();
					chk=false;
					System.exit(0);
					break;
				default:
					System.out.println("Please Enter a valid option!");
				
					
				}
				
			}
			catch(Exception e) {
				System.out.println(e.getClass().getName());
			}
			
		}while(chk==true);
		
	}
}
