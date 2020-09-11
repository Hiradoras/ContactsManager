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
		String nameForSearch = scanner.nextLine();
		scanner.close();
		
		try {
			for(int i =0;i<myContactsManager.myContacts.length;i++) {
				if(myContactsManager.myContacts[i].name.equals(nameForSearch)) {
					System.out.println(myContactsManager.myContacts[i].name + 
							": "+myContactsManager.myContacts[i].phoneNumber);
					break;
				}
			}
		}
		catch(NullPointerException e){
			System.out.println("There is no such a student.");
		}
	}
}
