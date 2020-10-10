package com.mgl7460.yearmanipulation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YearManipulationTest {
	
	// Declaration
	YearManipulation yearobject;

	@Before
	public void setUp() throws Exception {
		yearobject = new YearManipulation();
	}

	@After
	public void tearDown() throws Exception {
		yearobject = null;
	}

	@Test
	void testYearLength() {
		assertTrue(Integer.toString(2020).length() == 4);
		assertTrue(Integer.toString(995).length() > 2 && Integer.toString(995).length() < 4);
	}
	
	@Test
	void testThisYearLeapStatus() {
		assertTrue(yearobject.getThisYearLeapStatus(2016) == true);
		assertFalse(yearobject.getThisYearLeapStatus(2008) == true);
	}
	
	@Test
	void testGetNbYearsBetweenTwoValues() {
		assertEquals(4, yearobject.getNbYearsBetweenTwoValues(2016));
		assertEquals(10, yearobject.getNbYearsBetweenTwoValues(2000));
		assertEquals(0, yearobject.getNbYearsBetweenTwoValues(2020));
	}
	
	@Test
	void testGetThisYearCentury() {
		assertEquals(21, yearobject.getThisYearCentury(2020));
		assertEquals(20, yearobject.getThisYearCentury(2000));
		assertEquals(20, yearobject.getThisYearCentury(1978));
	}

}