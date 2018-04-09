package mobile;

public class Contact {
	private String name = null;
	private String phoneNumber;
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.setPhoneNumber(phoneNumber);
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	public static Contact createContact(String name, String num) {
	    	return new Contact(name,num);
	    }
}
   