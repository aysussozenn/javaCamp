package javaCampDay3Hw2;

public class User {
	private String identityNumber;
	private String name;
	private String age;
	public User(String identityNumber, String name, String age) {
		super();
		this.identityNumber = identityNumber;
		this.name = name;
		this.age = age;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	

}
