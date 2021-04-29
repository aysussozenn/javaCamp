package javaCampDay3Hw2;

public class Student extends User {
	
	private String school;
	public Student(String identityNumber, String name, String age, String school, String department,
			String studentNumber) {
		super(identityNumber, name, age);
		this.school = school;
		this.department = department;
		this.studentNumber = studentNumber;
	}
	private String department;
	private String studentNumber;

}
