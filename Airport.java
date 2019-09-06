package TD;

public class Airport {
	String[] code = new String[3];
	//ArrayList<Flight> flights = new ArrayList<Flight>();
	public Airport (String[] code) {
		this.code = code;
	}
	
	private String[] getName() {
		return this.code;
	}
}
