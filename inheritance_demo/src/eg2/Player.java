package eg2;

public class Player extends Person {

	private String game;
	private String role;
	private double average;
	private Team team;
	
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player(int id,String name,String game,String role,double average) {
		super(id,name);
		this.game=game;
		this.role=role;
		this.average=average;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	public void printPlayer() {
		printPerson();
		System.out.println("Game : "+game);
		System.out.println("Role : "+role);
		System.out.println("Average : "+average);
		team.printTeam();
	}
}
