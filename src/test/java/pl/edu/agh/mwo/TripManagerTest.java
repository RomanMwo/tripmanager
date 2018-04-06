package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {

	  TripManager tripMan;

	    @Before
	    public void beforeTest() {
	        tripMan = new TripManager();
	}
	    @Test
		public void addTripTest()
		{
	    	Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
	    	assertEquals(0, tripMan.getTrips().size());
	    	tripMan.addTrip(journey);
	    	assertEquals(1, tripMan.getTrips().size());
		}
		
	    @Test
	 		public void removeTripTest()
	 		{
	 	    	Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
	 	    	Trip journey2 = new Trip("wlochy", "gorsza pogoda");
	 	    	tripMan.addTrip(journey);
	 	    	tripMan.addTrip(journey2);
	 	    	tripMan.removeTrip(journey);
	 	    	assertEquals(1, tripMan.getTrips().size());
	 		}
	    
	    @Test
 		public void findTripTest()
 		{
 	    	Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
 	    	Trip journey2 = new Trip("wlochy", "gorsza pogoda");
 	    	tripMan.addTrip(journey);
 	    	tripMan.addTrip(journey2);
 	    	
 	    	assertEquals(journey2.getName(), tripMan.findTrip("wlochy") );
 		}
	
    
}
