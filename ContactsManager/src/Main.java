import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ContactsManager myContactsManager = new ContactsManager();
		Contact contact1 = new Contact();
		contact1.name = "name1";
		contact1.phoneNumber = "123123";
		myContactsManager.addContact(contact1);
		
		Contact contact2 = new Contact();
		contact2.name = "name2";
		contact2.phoneNumber = "123123";
		myContactsManager.addContact(contact2);
		
		Contact contact3 = new Contact();
		contact3.name = "name3";
		contact3.phoneNumber = "123123";
		myContactsManager.addContact(contact3);
		
		Contact contact4 = new Contact();
		contact4.name = "name4";
		contact4.phoneNumber = "123123";
		myContactsManager.addContact(contact4);
		
		System.out.print("Type a name to search: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Contact searchedContact = myContactsManager.searchContact(name);
		if (searchedContact.name.equals(name)) {
			System.out.println(searchedContact.name + ": "+searchedContact.phoneNumber);
		}
		else {
			System.out.println("There is no student with that name");
		}
		
	}
}
