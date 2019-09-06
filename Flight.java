package TD;
import java.util.Calendar;

public class Flight {
	Calendar flightDate;
	String[] flightID = new String[5];
	Airline airline;
	FlightSection flightSec;
	Airport depart;
	Airport destination;
	
	public Flight(Calendar flightDate,String[] flightID,Airline airline,FlightSection flightSec,Airport depart,Airport destination) {
		this.flightDate = flightDate;
		this.flightID = flightID;
		this.airline = airline;
		this.flightSec = flightSec;
		this.depart = depart;
		this.destination = destination;
	}
	
	
}
