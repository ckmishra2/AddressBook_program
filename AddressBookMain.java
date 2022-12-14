package addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBookMain {

	public  void start() {
		final int addPerson = 1;
		final int editContact = 2 ;
		final int deleteContact = 3 ;

		System.out.println("**********Welcome to Address Book Program***********");
		/*
		 * creating an arraylist to store the person details
		 * creating an arraylist to store the multiple person's details 
		 */
		ArrayList<AddContact> list = new ArrayList<AddContact>();
		System.out.println("if you want to add person in the address book please type 1 ");
		Scanner scanner = new Scanner(System.in);
		boolean status =true;
		/*
		 * checking for operations to perform like add person , edit person 
		 */
		while(status) {
			System.out.println("enter your choice");
			int option = scanner.nextInt();
			if(option ==  addPerson ) {
				AddContact person = new AddContact();
				person.addContact();
				list.add(person);
				System.out.println("person added!\n type 1 to add more person\n type 2 to edit added person\n type 3 to "
						+ "delete contact\n type 0 to exit");
			}
			// editing the existing contact
			else if(option == editContact ) {
				if(list.isEmpty()) {
					System.out.println("the addressbook is empty , first add some contacts");
					break;
				}
				else
					System.out.println("Enter the first name of the person to edit ");
				String fName = scanner.next();
				for(int j = 0 ; j<=list.size() ; j++) {
					if(fName.equalsIgnoreCase(list.get(j).getFirstname())) {
						AddContact newperson = new AddContact();  
						newperson.addContact();
						list.set(j,newperson);
						System.out.println("Done Editing ! ");
						System.out.println("type 1 to add more person\n type 2 to edit added person\n type 3 to "
								+ "type 4 to add more adrressbook"+ "delete contact\n type 0 to exit");
						break;
					}
				}
			}
			else if (option == deleteContact) {
				if(list.isEmpty()) {
					System.out.println("the addressbook is empty , first add some contacts");
					break;
				}
				else
					System.out.println("Enter the first name of the person to edit ");
				String fName = scanner.next();
				for(int j = 0 ; j<=list.size() ; j++) {
					if(fName.equalsIgnoreCase(list.get(j).getFirstname())) {
						list.remove(j);
						System.out.println("Person deleted ! ");
						break;
					}
				}
			}
			else {
				status= false;
			}
		}
		if(list.isEmpty()) {
			System.out.println("the addressbook is empty ");
		}
		/*
		 * printing the stored data
		 */
		else
			for(int j = 0 ; j<list.size() ; j++) {
				System.out.println(" contact ("+(j+1)+") is "+list.get(j));
			}
	}
	public static void main(String[] args) {
		AddressBookMain bootCamp = new AddressBookMain(); 
		AddressBookMain RFP = new AddressBookMain();
		AddressBookMain TFP = new AddressBookMain();
		AddressBookMain CFP = new AddressBookMain();
		bootCamp.start();
		TFP.start();
		RFP.start();
		CFP.start();
	}
}