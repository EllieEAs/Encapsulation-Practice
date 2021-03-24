
public class Person {
	
	//Encapsulation Practice (Getter and Setter)

	
	private String firstName;
	private String lastName;
	private int age;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName () {
		return this.firstName;
	}
	
	public String getLasttName () {
		return this.lastName;
	}
	
	public int getAge () {
		
		if ((age == 0) || (age > 100)) {
			return 0;
		}
		return this.age;
	}
	
	public boolean isTeen () {
		if ((age > 12) && (age < 20)) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		
		if ((firstName == null) || (lastName == null)){
			return "An Empty String";
		}else if ( lastName == null) {
			return firstName;
		}else if (firstName == null) {
			return lastName;
		}
		
		return firstName +" "+  lastName;
	}
}
