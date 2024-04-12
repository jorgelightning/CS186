package project2;

public enum Country {
	CZECH_REPUBLIC("Czech Republic"),
	NETHERLANDS("Netherlands"),
	GREAT_BRITAIN("Great Britain"),
	AUSTRIA("Austria"),
	USA("USA"),
	SLOVENIA("Slovenia"),
	JAPAN("Japan"),
	ITALY("Italy"),
	RUSSIA("Russia"),
	CHINA("China"),
	CANADA("Canada"),
	SK("South Korea"),
	GERMANY("Germany"),
	FRANCE("France");

	private final String name;       

    private Country(String s) {
        name = s;
    }

    public String toString() {
       return this.name;
    }
    
    public static Country getCountryFromString(String country) {
    	for (Country c: Country.values()) {
    		if (c.name.equals(country)) {
    			return c;
    		}
    	}
    	return null;
    }
}
