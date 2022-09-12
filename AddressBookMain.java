package addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBookMain {
	static final int ADD_PERSON = 1;
	public  void start() {
		final int ADD_PERSON = 1;
		final int EDIT_ADDRESSBOOK = 2 ;
		System.out.println("**********Welcome to Address Book Program***********");
		ArrayList<AddContact> list = new ArrayList<AddContact>();
		System.out.println("if you want to add person in the address book please type 1 ");
		Scanner scanner = new Scanner(System.in);
		ArrayList<AddContact> list = new ArrayList<AddContact>();
		AddContact person = new AddContact();
		int option = scanner.nextInt();
		if(option == ADD_PERSON ) {
			person.addContact();
			list.add(person);
		boolean status =true;
		while(status) {
			System.out.println("enter your choice");
			int option = scanner.nextInt();
			if(option == ADD_PERSON ) {
				AddContact person = new AddContact();
				person.addContact();
				list.add(person);
				System.out.println("person added!\n type 1 to add more person\n type 2 to edit added person\n type 0 to exit");
			}
			else if(option == EDIT_ADDRESSBOOK ) {
				System.out.println("Enter the first name of the person to edit ");
				String fName = scanner.next();
				for(int j = 0 ; j<=list.size() ; j++) {
					if(fName.equalsIgnoreCase(list.get(j).getFirst_name())) {
						System.out.println();
						AddContact newperson = new AddContact();  
						newperson.addContact();
						list.set(j,newperson);
						System.out.println("Done Editing ! ");
						System.out.println("type 1 to add more person\n type 2 to edit added person\n type 0 to exit");
						break;
					}
				}
			}
			else {
				status= false;
			}
		}
		System.out.println("entered addresses are"+list.get(0));

		System.out.println("size is "+list.size());	
		for(int j = 0 ; j<list.size() ; j++) {
			System.out.println("entered addresses are"+list.get(j));
		}
		}
	}
	public static void main(String[] args) {
		AddressBookMain start =new 	AddressBookMain(); 
		start.start();
	}
	}

	

