package javaCampDay3Hw2;

public class Main {
	
	public static void main(String[] args) {
		
		

		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		UserManager userManager =new UserManager();
		
		userManager.addToSystem(instructorManager);
		userManager.addToSystem(studentManager);

	}
	

	

}
