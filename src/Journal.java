public record Journal(String title) implements Resource {
	@Override
	public void borrowResource(Student student) {
		System.out.println("Student " + student.name() + " borrowed the journal '" + title + "'.");
	}
}
