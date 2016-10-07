package com.daehosting.tempconversion;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by student on 10/5/16.
 */
public class TemperatureConversionsTest {

    TemperatureConversionsSoapType service;

    @Before
    public void setUp() throws Exception {
        service = new TemperatureConversions().getTemperatureConversionsSoap12();

    }

    @Test
    public void getTemperatureConversionsSoap12test1() throws Exception {
        //TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal farenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(10.0));

        assertEquals("The celsius to farenheit conversion failed",farenheitResult, BigDecimal.valueOf(50) );

    }

    @Test
    public void getTemperatureConversionsSoap12test2() throws Exception {
        //TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal celsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(50.0));

        assertEquals("The farenheit to celsius conversion failed",celsiusResult, BigDecimal.valueOf(10) );

    }

    @Test
    public void getTemperatureConversionsSoap12test3() throws Exception {
        //TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal windchilInCelsius = service.windChillInCelsius(BigDecimal.valueOf(32.0), BigDecimal.valueOf(60.0));
        assertEquals("The windchill in celsius conversion failed",windchilInCelsius, BigDecimal.valueOf(43.21) );

    }

    @Test
    public void getTemperatureConversionsSoap12test4() throws Exception {
        //TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal windchilInFarenheit = service.windChillInFahrenheit(BigDecimal.valueOf(20.0), BigDecimal.valueOf(80.0));
        assertEquals("The windchill in farenheit conversion failed",windchilInFarenheit, BigDecimal.valueOf(-19.46199991) );

    }

}