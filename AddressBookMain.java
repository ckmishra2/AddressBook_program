package addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBookMain {
	static final int ADD_PERSON = 1;
	public static void main(String[] args) {
		System.out.println("**********Welcome to Address Book Program***********");
		System.out.println("if you want to add person in the address book please type 1 ");
		Scanner scanner = new Scanner(System.in);
		ArrayList<AddContact> list = new ArrayList<AddContact>();
		AddContact person = new AddContact();

		int option = scanner.nextInt();
		if(option == ADD_PERSON ) {
			person.addContact();
			list.add(person);
		}
		System.out.println("entered addresses are"+list.get(0));
	}

}

	

