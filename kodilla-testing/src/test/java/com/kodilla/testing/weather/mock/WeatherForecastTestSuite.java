package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    private Map<String, Double> wetherData(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 11.0);
        temperaturesMap.put("Krakow", 12.0);
        temperaturesMap.put("Wroclaw", 14.0);
        temperaturesMap.put("Warszawa", 18.0);
        temperaturesMap.put("Gdansk", 3.0);
        return temperaturesMap;
    }

    @Mock
    private Temperatures temperaturesMock;
    @DisplayName("Tests of CalculateForecastWithMock method")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(wetherData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @DisplayName("Tests of CalculateAverageTemperature method")
    @Test
    void testCalculateAverageTemperature(){
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(wetherData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        Double temperatureAverage = weatherForecast.calculateAverageTemperature();
        //Then
        Assertions.assertEquals(11.6, temperatureAverage);
    }
    @DisplayName("Tests of CalculateMedianOfTemperature method")
    @Test
    void testCalculateMedianOfTemperature(){
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(wetherData());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        Double medianOfTemperature = weatherForecast.calculateMedianOfTemperature();
        //Then
        Assertions.assertEquals(12.0, medianOfTemperature);
    }
}
