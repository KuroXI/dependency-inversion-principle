public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		Student student = new Student("Victor Gonzales");

		Book book = new Book("Visual Analytics in Processing Big Spatial Data");
		Journal journal = new Journal("Journal of the year");
		EJournal eJournal = new EJournal("The National News");

		library.borrowResource(student, book);
		library.borrowResource(student, journal);
		library.borrowResource(student, eJournal);
	}
}
