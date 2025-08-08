package cseb;
class Books{
	String title;
	String author;
	final int bookID;
	static int bookNo;
	static int bookCounter=100;
	boolean showLibrary;
	static final String  library_name="Central Library";
	Books(){
		title = "DEFAULT";
		author = "DEFAULT";
		bookID = 0;
	}
	Books(String title,String author){
		this.title=title;
		this.author=author;
		bookID=bookCounter++;
		bookNo++;
	}
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Book ID: "+bookID);
	}
	public void displayInfo(boolean showLibrary) {
		if (showLibrary == true) {
			System.out.println("Library Name: "+ "Central Library");
		}
		else {
			System.out.println("Library Name: "+ "None");
		}
	}
	public static void displayTotalBooks() {
		System.out.println("Total No of Books: "+ bookNo);
	}
}
public class BookStore {
	public static void main(String[] args) {
	Books b1 = new Books();
	b1.displayInfo();
	b1.displayTotalBooks(); 
	System.out.println();
	
	Books b2 = new Books("No body Cares", "Somebody");
	b2.displayInfo();
	b2.displayInfo(true);
	b2.displayTotalBooks();
	System.out.println();
	
	Books b3 = new Books("No body Cares", "Somebody");
	b3.displayInfo();
	b3.displayInfo(true);
	b3.displayTotalBooks();
	}
}



