package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;


import org.junit.Test;

public class TripTest {
	
	
	@Test
	public void getTripName()
	{
		Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
		assertEquals("Hiszpania", journey.getName());
	}
	
	@Test
	public void getTripDescription()
	{
		Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
		assertEquals("Wspaniala pogoda", journey.getDescription());
	}
	
	@Test
	public void setTripName()
	{
		Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
		journey.setName("wlochy");
		assertEquals("wlochy", journey.getName());
	}
	
	@Test
	public void setTripDescription()
	{
		Trip journey = new Trip("Hiszpania", "Wspaniala pogoda");
		journey.setDescription("pogoda");
		assertEquals("pogoda", journey.getDescription());
	}

	@Test
	public void addPhoto() {
		Trip trip = new Trip("Hiszpania", "Wspaniala pogoda");
		Photo photo = new Photo("naj");
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
	
	@Test
	public void getPhot() {
		Collection<Photo> newPhotos = new ArrayList<>();
		Trip trip = new Trip("Hiszpania", "Wspaniala pogoda");
		Photo photo = new Photo("naj");
		trip.addPhoto(photo);
		newPhotos.add(photo);
		
		 assertEquals(newPhotos, trip.getPhotos());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testThrowsExeption() {
		Trip trip = new Trip("Hiszpania", "Wspaniala pogoda");
		Photo photo = new Photo("naj");
		trip.addPhoto(photo);
		((ArrayList<Photo>) trip.photos).get(2);
	
}
	
}
