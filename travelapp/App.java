package travelapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		// We prompt the user for a searchTerm.
		
		String searchTerm = search();
		
		// We initialize our trips arrayList, that will work as our persistence
		ArrayList<Trip> trips = new ArrayList<Trip>();
		 
		 
		 // Sample of Hotels and Flights
		 Hotel hotel1 = new Hotel("Hotel Best Madrid", 3);
		 Hotel hotel2 = new Hotel("Worst Paris" , 4);
		 Hotel hotel3 = new Hotel("Hotel Worst Berlin", 4);
		 Flight flight1 = new Flight("Madrid", "09:00");
		 Flight flight2 = new Flight("الأقصر‎", "10:00");
		 Flight flight3 = new Flight("北京市", "10:00");
		 
		 // Create some example trips
		 Trip europeCapitals = new LandTrip("Europe Popular Capitals","Land trip", "Madrid, Paris, London", 3, hotel1, hotel2);
		 Trip europeCities = new LandTrip("Europe laying out cities","Land trip", "Berlin, Madrid", 3, hotel1, hotel3);
		 Trip infiniteEgypt = new AirTrip("Infinite Egipt", "Air trip", "Madrid, القاهرة‎, الأقصر‎", 4, flight1, flight2);
		 Trip incredibleChina = new AirTrip("Incredible China", "Air trip", "Barcelona, Madrid, 广州市, 北京市", 10, flight1, flight3);
		    
		 // Creation of out database (adding `trips` to ArrayList)
		 trips.addAll(Arrays.asList(europeCapitals, europeCities, incredibleChina, infiniteEgypt));  
		    
		 // Search for trips that match the entered search term
		 
		 trips.forEach(t-> { 
			 if ((t.getCities()).toLowerCase().contains(searchTerm)) // checking if our 3 character input match any of our cities.
			 System.out.println(t);
			 }); 
		    	
	}
	
	/**
	 * search() method prompts and validates the user for a 3 character search term.
	 * If it's correct it returns the searchTerm as a String. If not prompts again 
	 * @Param: Nothing
	 * @return: String
	 */
	public static String search() {
		Scanner input = new Scanner(System.in, "UTF-8");  // To support Asian and middle east language we make use of charset UTF-8
		System.out.println("Enter the search term (only 3 character): ");
		String searchTerm = input.nextLine();
		    
		while (searchTerm.length() != 3) {
			System.out.println("Invalid input, please enter exactly 3 alphabetical characters: ");
		    searchTerm = input.nextLine();
		}
		
		input.close();
		return searchTerm.toLowerCase();
		
	}
		


	}


