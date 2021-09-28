package dir;

public class welcome_menu {
	public static void welcome() {
		System.out.println("************************************************\n"+"Welcome to LockedMe\n"
	+"The Application was developed by Ashish Prasad ");
		
		System.out.println();
		System.out.println("*************************************************\n"+""
				+ "This Application can perform following options:\n"+
				"1.To Sort the files in Ascending order in Directed folder\n"+
				"2.To Create,Delete and Search for a file in Directed folder");
		
		System.out.println("The menu:\n");
		//menu();
	}
	public static void menu() {
		
		System.out.println("************************************************\n"+""
				+ "Choose an option from 1-3 for the following menu below:\n"+""
						+ "1.Retrieve all files in Ascending order in directed folder\n"+
				"2.File menu options(Create,delete,Search\n"+
						"3.Exit the program");
	}
	public static void fileoptions() {
		System.out.println("*************************************************\n"+
				"1.Create a new file in Directed folder\n"+
				"2.Delete a file from Directed folder\n"+
				"3.Search for a file in Directed folder\n"+
				"4.Return back to main menu");
	}
}
