package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {

	  TripManager tripMan;
	  Trip journey;
	  Trip journey2;
	  
	    @Before
	    public void beforeTest() {
	        tripMan = new TripManager();
	        journey = new Trip("Hiszpania", "Wspaniala pogoda");
	        journey2 = new Trip("wlochy", "gorsza pogoda");
	}
	    @Test
		public void addTripTest()
		{
	    	assertEquals(0, tripMan.getTrips().size());
	    	tripMan.addTrip(journey);
	    	assertEquals(1, tripMan.getTrips().size());
		}
	    
	    @Test
		public void addTheSameTripTest()
		{
	    	tripMan.addTrip(journey);
	    	tripMan.addTrip(journey);
	    	tripMan.addTrip(journey2);
	    	assertEquals(2, tripMan.getTrips().size());
		}
	    
		
	    @Test
	 		public void removeTripTest()
	 		{
	 	    	tripMan.addTrip(journey);
	 	    	tripMan.addTrip(journey2);
	 	    	tripMan.removeTrip(journey);
	 	    	assertEquals(1, tripMan.getTrips().size());
	 		}
	    
	    @Test
 		public void findTripTest()
 		{
 	    	tripMan.addTrip(journey);
 	    	tripMan.addTrip(journey2);
 	    	String lookingFor = "Hiszpania";
 	    	
 	    	assertTrue(tripMan.findTrip(lookingFor));
 		}
	
	    @Test
 		public void notFindTripTest()
 		{
 	    	tripMan.addTrip(journey);
 	    	tripMan.addTrip(journey2);
 	    	String lookingFor = "szpania";
 	    	
 	    	assertFalse(tripMan.findTrip(lookingFor));
 		}
	    
	    @Test
	    public void getTripsTest()
	    {
	    	tripMan.addTrip(journey);
	    	assertEquals(1, tripMan.getTrips().size());
	    }
}
