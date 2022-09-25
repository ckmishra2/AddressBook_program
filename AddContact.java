package addressbook;

import java.util.Scanner;

public class AddContact {
	static final int AddPerson= 1;
	private String firstName ;
	private String lastName ;
	private String address ;
	private String city ;
	private String state ;
	private int zipCode;
	private long phoneNumber;
	private String email;
	;
	Scanner scanner = new Scanner(System.in);
	/*
	 *taking input from the user  
	 * using console
	 */
	public void  addContact() {
		AddContact person = new AddContact();
		System.out.println("Enter First Name : ");
		firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		lastName = scanner.next();
		System.out.println("Enter Address : ");
		address = scanner.next();
		System.out.println("Enter City : ");
		city = scanner.next();
		System.out.println("Enter State : ");
		state = scanner.next();
		System.out.println("Enter ZipCode : ");
		zipCode = scanner.nextInt();
		System.out.println("Enter Mobile Number : ");
		phoneNumber = scanner.nextLong();
		System.out.println("Enter EmailId : ");
		email = scanner.next();
	}

	/*
	 * Indicates that a method declaration is intended to override a method declaration in a super type.  
	 */
	@Override
	public String toString() {
		return "[first name : " + firstName + ", last name : " + lastName + ", address : " + address + ", city : "
				+ city + ", state : " + state + ", zip code : " + zipCode + ", phone number : " + phoneNumber + ", email : "
				+ email + "]";
	}
	/*
	 *making getters and setters 
	 * to make private members accesible
	 * outside the class 
	 */
	public String getFirstname() {
		return firstName;
	}
	public void setFirst_name(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLast_name(String lastname) {
		this.lastName = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipCode;
	}
	public void setZipcode(int zipcode) {
		this.zipCode = zipcode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}


