package project2;

import java.util.*;

public class Processes {
	  private ArrayList<Climber> climbers;

	  public Processes(ArrayList<Climber> climbers) {
	    this.climbers = climbers;
	  }

	  public void ByCountry() {
	    HashMap<Country, Integer> countryCount = new HashMap<>();
	    for (Climber climber : climbers) {
	      Country country = climber.getCountry();
	      countryCount.put(country, countryCount.getOrDefault(country, 0) + 1);
	    }
	    System.out.println("Climbers by Country:");
	    for (Map.Entry<Country, Integer> entry : countryCount.entrySet()) {
	      System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
	  }

	}
