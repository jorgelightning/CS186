package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Driver {
	  public static void main(String[] args) {
	    ArrayList<Climber> climbers = new ArrayList<>();
	    try {
	      Scanner scanner = new Scanner(new File("climbers.txt"));

	      while (scanner.hasNextLine()) {
	        String line = scanner.nextLine();
	        String[] data = line.split(",");

	        int rank = Integer.parseInt(data[0]);
	        int points = Integer.parseInt(data[1]);

	        String fullName = data[2];
	        int spaceIndex = fullName.indexOf(' ');
	        String name;
	        if (spaceIndex != -1) {
	          name = fullName.substring(0, spaceIndex);
	        } else {
	          name = fullName;
	        }

	        String countryStr = data[3];
	        Country country = Country.getCountryFromString(countryStr);

	        boolean isDuplicate = false;
	        for (Climber existingClimber : climbers) {
	          if (existingClimber.getName().equals(name) && existingClimber.getCountry().equals(country)) {
	            isDuplicate = true;
	            break;
	          }
	        }

	        if (!isDuplicate) {
	          climbers.add(new Climber(rank, points, name, country));
	        }
	      }
	      scanner.close();

	      Processes processor = new Processes(climbers);
	      processor.analyzeClimberDistributionByCountry();

	    } catch (FileNotFoundException e) {
	      System.err.println("Error: File climbers.txt not found!");
	    }
	  }
	}

