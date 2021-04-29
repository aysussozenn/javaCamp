package javaCampDay3Hw2;

public class Instructor extends User {
	private String profession;
	private String workplace;
	
	public Instructor(String identityNumber, String name, String age, String profession, String workplace) {
		super(identityNumber, name, age);
		this.profession = profession;
		this.workplace = workplace;
	}
	
	

}
