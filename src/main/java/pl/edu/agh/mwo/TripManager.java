package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager
{

	private Collection<Trip> trips = new ArrayList<Trip>();

	public void addTrip(Trip trip)
	{
		String name = null;

		for (Trip tri : trips)
		{
			if (tri.getName() == trip.getName())
			{
				name = tri.getName();
			}

		}
		if (name == trip.getName())
		{
			System.out.println("Trip " + trip.getName()
					+ " has arleady exist and wasn't added");
		} else
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

	public boolean findTrip(String nameTrip)
	{
		boolean results = false;
		for (Trip trip : trips)
		{
			if (trip.getName() == nameTrip)
			{
				results = true;
				break;
			} else
				results = false;
		}

		return results;
	}

}
