class BookNotAvailableException extends Exception {
	BookNotAvailableException(String msg) {
		super(msg);
	}
}

class Library {
	int availableBooks;
	Library(int books) {
		availableBooks = books;
	}
 
	void issueBook(int count) throws BookNotAvailableException {
 		if (count <= availableBooks) {
			availableBooks -= count;
			System.out.println("Book issued successfully");
			System.out.println("Remaining Books: " + availableBooks);
		} else {
 			throw new BookNotAvailableException("Requested books not available");
		}
	}
}

class LibraryApp {
	public static void main(String[] args) {
		System.out.println("Preksha Patel");
		System.out.println("240390107031");
		Library lib = new Library(3);
		try {
			lib.issueBook(2);
			lib.issueBook(2);
		} catch (BookNotAvailableException e) {
			System.out.println("Exception: " + e.getMessage());
 		}
 	}
}