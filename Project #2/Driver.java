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

				String countryStr = data[3];
				Country country = Country.getCountryFromString(countryStr);

				boolean isDuplicate = false;
				for (Climber existingClimber : climbers) {
					if (existingClimber.getName().equals(fullName) && existingClimber.getCountry().equals(country)) {
						isDuplicate = true;
						break;
					}
				}

				if (!isDuplicate) {
					climbers.add(new Climber(rank, points, fullName, country));
				}
			}
			scanner.close();

			ClimberAnalyzers processor = new ClimberAnalyzers(climbers);
			processor.ByCountry();

		} catch (FileNotFoundException e) {
			System.err.println("Error!!: climbers.txt isn't there!");
		}
	}
}
