import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


import convert.Converter;

public class ConverterTest {

	Converter convert;

	@Before
	public void setUp() {
		convert = new Converter();
	}

	@Test
	public void shouldReturnKgWhenConvertKgToPounds() {
		double result = convert.toPounds(1.0);
		assertEquals(2.205, result, 0);
	}

	@Test
	public void shouldReturnKilogramsWhenConvertPoundsToKg() {
		double result = convert.toKilograms(1.0);
		assertEquals(0.4536, result, 0);
	}

	@Test
	public void shouldReturnInchesWhenConvertCmToInch() {
		double result = convert.toInches(1.0);
		assertEquals(0.393701, result, 0);
	}

	@Test
	public void shouldReturnCmWhenConvertInchToCm() {
		double result = convert.toCentimetres(1.0);
		assertEquals(2.54, result, 0);
	}

	@Test
	public void shouldReturnFahrenheitWhenConvertCelsiusToFarenheit() {
		double result = convert.toFahrenheit(1.0);
		assertEquals(33.8, result, 0);
	}

	@Test
	public void shouldReturnCelsiusWhenConvertFarenheitToCelsius() {
		double result = convert.toCelsius(1.0);
		assertEquals(-17.22222222222222, result, 0);
	}

}
