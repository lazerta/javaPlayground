package mobile;

import java.util.ArrayList;

public class Phone  {
     private String nyNum;
     private ArrayList<Contact> myContacts;
     
	public Phone(String nyNum) {
		this.nyNum = nyNum;
		myContacts = new ArrayList<>();
	}
	
	public void list() {
		if(myContacts.size() < 1) {
			System.out.println("empty contacts");
			return;
		}
		for(Contact i : myContacts) {
			System.out.println(i);
		}
	}

    	

	private int findContact(String name) {
		
		 for(int i = 0; i < myContacts.size(); i++) {
			 Contact tem = myContacts.get(i);
			 if(tem.getName().equals(name)) {
				 return i;
			 }
		 }
		 return -1;
	}
	 
	public boolean add(Contact contact) {
		if(findContact(contact.getName()) >=0) {
			System.out.println(contact + "already exist");
			return false;
		}
		
		  myContacts.add(contact);
		  return true;
	}
	
	
	public boolean update(Contact old, Contact latest) {
		 int position = myContacts.indexOf(old);
		 if(position < 0) {
			 System.out.println(old+"No Found");
			 return false;
		 }
		 else if(findContact(latest.getName()) != -1) {
			 System.out.println(latest+" already exist");
			 return false;
		 }
		myContacts.set(position, latest);
		 return true;
	}
	
	public String queryContact(Contact contact) {
		if(myContacts.indexOf(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}
	
	public boolean remove(Contact contact) {
		int postion = myContacts.indexOf(contact);
		if(postion < 0) {
			return false;
		}
		myContacts.remove(postion);
		return true;
	}
	
	public Contact queryContact(String name) {
		int position = findContact(name);
		if(position >= 0) {
			return myContacts.get(position);
			
		}
		return null;
		
	}
}
