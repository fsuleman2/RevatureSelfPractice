package eg2;

public class Address {
	private int aid;
	private String streetName;
	private String city;
	private String state;
	private int zip;
	public Address(int aid, String streetName, String city, String state, int zip) {
		//super();
		this.aid = aid;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void printPresentAddress() {
		System.out.println();
		System.out.println("Printing Person's Present Address ");
		System.out.println("Address ID: "+ aid);
		System.out.println("Street Name: "+streetName);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip Code: "+zip);
	}

	public void printPermanentAddress() {
		System.out.println();
		System.out.println("Printing Person's Permanent Address ");
		System.out.println("Address ID: "+ aid);
		System.out.println("Street Name: "+streetName);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip Code: "+zip);
	}
	
}
