package travelapp;

public class Hotel {
	
	private String hotelName;
	private int hotelCategory;
	
	/**
	 * 
	 * @param hotelName
	 * @param hotelCategory
	 */
	public Hotel(String hotelName, int hotelCategory) {
	    this.hotelName = hotelName;
	    this.hotelCategory = hotelCategory;
	}
	    
	public String getHotelName() {
	    return hotelName;
	}
	    
	public int getHotelCategory() {
		return hotelCategory;
	}
	    
	@Override
	public String toString() {
		return hotelName + " " + hotelCategory + "*";
	}

}
