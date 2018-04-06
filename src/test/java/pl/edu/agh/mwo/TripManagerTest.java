package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {

	  TripManager tripMan;

	    @Before
	    public void beforeTest() {
	        tripMan = new TripManager();
	}
	    @Test
		public void addTripTest(Trip trip)
		{
	    	Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
	    	tripMan.addTrip(journey);
		}
}
