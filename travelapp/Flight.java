package travelapp;

public class Flight {
	  
	private String departureCity;
	private String departureTime;
	
	/**
	 * 
	 * @param departureCity
	 * @param departureTime
	 */
	public Flight(String departureCity, String departureTime) {
		this.departureCity = departureCity;
	    this.departureTime = departureTime;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		return departureCity + " " + departureTime;
	}

	 

	
	}


