package week2.HomeAssignment;

public class Liabrary {
	
	public String addBook(String BookTitle) {
		System.out.println(BookTitle + " : Book Added Successfully");
		return BookTitle;
		
	}
	public void issueBook() {
		System.out.println("Book Issued Successfuly");
		
	}

	public static void main(String[] args) {
		Liabrary liabrary=new Liabrary();
		liabrary.addBook("Mahabharat");
		liabrary.issueBook();
		
	}

}
