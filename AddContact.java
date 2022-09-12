package addressbook;

import java.util.Scanner;

public class AddContact {

	static final int ADD_PERSON = 1;
	private String first_name ;
	private String last_name ;
	private String address ;
	private String city ;
	private String state ;
	private int zip_code;
	private long phone_number;
	private String email;
	Scanner scanner = new Scanner(System.in);
	public void  addContact() {
		System.out.println("Enter First Name : ");
		first_name = scanner.next();
		System.out.println("Enter Last Name : ");
		last_name = scanner.next();
		System.out.println("Enter Address : ");
		address = scanner.next();
		System.out.println("Enter City : ");
		city = scanner.next();
		System.out.println("Enter State : ");
		state = scanner.next();
		System.out.println("Enter ZipCode : ");
		zip_code = scanner.nextInt();
		System.out.println("Enter Mobile Number : ");
		phone_number = scanner.nextLong();
		System.out.println("Enter EmailId : ");
		email = scanner.next();
	}
	@Override
	public String toString() {
		return "[first name : " + first_name + ", last name : " + last_name + ", address : " + address + ", city : "
				+ city + ", state : " + state + ", zip code : " + zip_code + ", phone number : " + phone_number + ", email : "
				+ email + "]";
	}
	public String getFirst_name() {
		return first_name;
	}
}


