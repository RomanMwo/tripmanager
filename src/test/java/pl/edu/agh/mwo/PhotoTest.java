package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhotoTest
{
	Photo shot;
	@Before
	public void createForTheTest()
	{
		shot = new Photo("naj");
	}

	@Test
	public void namePhoto()
	{
		assertEquals("naj", shot.getComment());
	}
	
	@Test
	public void setingName()
	{
		shot.setComment("cos");
		assertEquals("cos", shot.getComment());
	}

}
