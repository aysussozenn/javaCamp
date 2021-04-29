package javaCampDay2Hw1;

public class Student {

	private String firstName;
	private String lastName;
	private int courseCompletionRate;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String firstName) {
		this.firstName = firstName;
	}

	public int getCourseCompletionRate() {
		return courseCompletionRate;
	}

	public void setCourseCompletionRate(int courseCompletionRate) {
		this.courseCompletionRate = courseCompletionRate;
	}

}
