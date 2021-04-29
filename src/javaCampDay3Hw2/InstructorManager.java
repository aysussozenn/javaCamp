package javaCampDay3Hw2;

public class InstructorManager extends AddSystem {
	
	public void addToSystem() {
		Instructor instructor = new Instructor("10987654321", "Alper Dönmez", "42", "Graphic Design", "AYBU");
		System.out.println("The instructor "+instructor.getName()+" uploaded the homework to the system");
	}

}
