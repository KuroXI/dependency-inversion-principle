public record EJournal(String title) implements Resource {
	@Override
	public void borrowResource(Student student) {
		System.out.println("Student " + student.name() + " borrowed an E-Journal '" + title + "'.");
	}
}
