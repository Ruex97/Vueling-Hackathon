package travelapp;


class LandTrip extends Trip {
    private Hotel hotel1;
    private Hotel hotel2;
    
    /**
     * 
     * @param tripName
     * @param tripType
     * @param cities
     * @param duration
     * @param hotel1
     * @param hotel2
     */
    public LandTrip(String tripName,String tripType, String cities, int duration, Hotel hotel1, Hotel hotel2) {
        super(tripName, tripType,cities, duration);
        this.hotel1 = hotel1;
        this.hotel2 = hotel2;
    }
    
    public Hotel getHotel1() {
        return hotel1;
    }
    
    public Hotel getHotel2() {
        return hotel2;
    }
    
    @Override
    public String toString() {
        return super.toString() + "; " + hotel1.toString() + ", " + hotel2.toString();
    }
}