package travelapp;

class AirTrip extends Trip {
	
    private Flight flight1;
    private Flight flight2;
    
    /**
     * 
     * @param tripName
     * @param tripType
     * @param cities
     * @param duration
     * @param flight1
     * @param flight2
     */
    public AirTrip(String tripName, String tripType, String cities, int duration, Flight flight1, Flight flight2) {
    	
        super(tripName, tripType, cities, duration);
        this.flight1 = flight1;
        this.flight2 = flight2;
        
    }
    
    public Flight getFlight1() {
        return flight1;
    }
    
    public Flight getFlight2() {
        return flight2;
    }
    
    @Override
    public String toString() {
        return super.toString() + "; " + flight1.toString() + ", " + flight2.toString();
    }
    
  }