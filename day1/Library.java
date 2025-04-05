package Week2.day1;

public class Library {
	public String addBook(String bookTitle){
		System.out.println("Book added successfully");
		System.out.println();
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	
	}

	public static void main(String[]args) {
		
		//creating object to call method
		Library bookOptions = new Library();
		bookOptions.addBook("Book Title");
		bookOptions.issueBook();
	}
}
