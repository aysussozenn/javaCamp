package javaCampDay3Hw2;

public class StudentManager extends AddSystem {
	public void addToSystem() {
	    Student student = new Student("12345678910", "Aysu Sözen", "22", "AYBU", "CENG", "456987");
		System.out.println("The student "+student.getName()+" add solution for homework to the system");
	}


}
