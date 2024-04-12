package project2;

public class Climber {
	private int rank;
	private int points;
	private String name;
	private Country country;

	public Climber(int rank, int points, String name, Country country) {
		this.rank = rank;
		this.points = points;
		this.name = name;
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

	public Object getName() {
		return name;
	}
}
