package javaCampDay2Hw1;

public class StudentManager {
	
	public void registerCourse(Student student) {
		System.out.println("Student "+ student.getName()+" "+student.getLastName()+" is registered the course.");
	}
	
	public void courseCompletion(Student student, int completionRate) {
		if (completionRate ==100) {
			System.out.println("Course completion is successfull !");
		}
		else {
			System.out.println("Course completion is not successfull !");
		}
		
	}

}
