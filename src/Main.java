
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("Full Name: " + person.getFullName());
		
		System.out.println("Teen: " + person.isTeen());
		
		person.setFirstName("Jhon");
		System.out.println("Full Name: " + person.getFullName());
	
		person.setAge(18);
		System.out.println("Teen: " + person.isTeen());
		
		person.setLastName("Smith");
		System.out.println("Full Name: " + person.getFullName());
		
		

	}

}
