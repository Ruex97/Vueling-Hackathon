package travelapp;

public abstract class Trip {
	
    private String tripName;
    private String tripType;
    private String cities;
    private int duration;
    
    /**
     * 
     * @param tripName
     * @param tripType
     * @param cities
     * @param duration
     */
    public Trip(String tripName, String tripType, String cities, int duration) {
        this.tripName = tripName;
        this.tripType = tripType;
        this.cities = cities;
        this.duration = duration;
    }
    
    public String getTripName() {
        return tripName;
    }
    
    public String getTripType() {
        return tripType;
    }
    
    public String getCities() {
		return cities;
	}

	public int getDuration() {
        return duration;
    }

	@Override
	public String toString() {
		return tripName + "; " + tripType + "; " + duration + " days; " + cities;
	}

	
   
}
  
	


