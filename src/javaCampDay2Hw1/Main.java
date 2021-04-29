package javaCampDay2Hw1;

public class Main {
	public static void main(String[] args) {
	    Student student = new Student();
	    student.setName("Aysu");
	    student.setLastName("Sözen");
	    student.setCourseCompletionRate(100);
	    
	    Course course =new Course();
	    course.setName("JAVA");
	    course.setDetail("Java+ React");
	    
	    StudentManager studentManager = new StudentManager();
	    
	    studentManager.registerCourse(student);
	    studentManager.courseCompletion(student, 100);
	    
	    System.out.println("Course: "+course.getName()+"\n"+course.getDetail());

	}

	
	

	
	
	

}
