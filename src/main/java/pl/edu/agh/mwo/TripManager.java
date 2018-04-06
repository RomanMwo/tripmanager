package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager
{

	private Collection<Trip> trips = new ArrayList<Trip>();

	public void addTrip(Trip trip)
	{
		trips.add(trip);

	}

	public Collection<Trip> getTrips()
	{
		return trips;
	}

	public void removeTrip(Trip trip)
	{
		trips.remove(trip);
	}

	public String findTrip(String nameTrip)
	{
		String results = null;
		Trip trip = new Trip(nameTrip, "dowolnyNieistotnyDescription");
		if (trip.getName() == nameTrip)
			results = nameTrip;
		else 
			System.out.println("nie znalezlismy twojej wycieczki");
		return results;
	}

}
