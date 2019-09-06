package TD;
import java.util.Calendar;
import java.util.HashSet;

public class Airline {
	String[] name = new String[5];
	HashSet flights = new HashSet<Flight>();
	
	public Airline(String[] name) {
		this.name = name;
	}
	
	public String[] getName() {
		return this.name;
	}
	
	public void setName(String[] newName) {
		this.name = newName;
	}
	
	public Flight createFlight(Calendar flightDate,String[] flightID,FlightSection flightSec,Airport depart,Airport destination) {
		Flight f = new Flight(flightDate, flightID,this, flightSec, depart, destination );
		return f;
	}
}
