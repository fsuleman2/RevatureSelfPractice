package eg2;

public class Main {

	public static void main(String[] args) {

//		Team t1=new Team(9000, "INDIA", "Gary Cristen");
//		Player p1 = new Player(100, "Sachin", "Cricket", "Opening Batsman", 66.66);
//		p1.setTeam(t1);
//		System.out.println("Printing details of player "+p1.getName());
//		p1.printPlayer();
//		Player p2=new Player(101, "MS Dhoni", "Cricket", "WicketKeeper Batsman", 55.55);
//		p2.setTeam(t1);
//		System.out.println("\nPrinting details of player "+p2.getName());
//		p2.printPlayer();
//		
//		Team t2=new Team(9001, "India", "Some coach");
//		Player p3=new Player(102, "Saina Neihwal", "Shuttle", "player", 88.88);
//		p3.setTeam(t2);
//		System.out.println("\nPrinting details of player "+p3.getName());
//		p3.printPlayer();
		System.out.println();
		
		//for employee
		Employee emp = new Employee(101,"Suleman","SDE",75000);
		Address ad = new Address(510,"Banjarahills","Hyderabad","Telangana",50010);
		Address ad1 = new Address(511,"Redhills","Hyderabad","Telangana",50050);
		Project p = new Project(100,"Revature");
		emp.setPresentAddress(ad);
		emp.setPermanentAddress(ad1);
		emp.PrintingEmployeesDetails();
		System.out.println();
		p.printProjectDetails();
		
		
		
		

	}
}
