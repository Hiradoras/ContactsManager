public class ContactsManager {
	Contact[] myContacts;
	int count;
	ContactsManager(){
		myContacts = new Contact[10];
		count = 0;
	}
	void addContact(Contact contact) {
		myContacts[count] = contact;
		count++;
	}
	Contact searchContact(String searchName) {
		for(int i=0;i<count;i++) {
			if(myContacts[i].name == searchName) {
				return myContacts[i];
			}
		}
		return null;
	}
}
