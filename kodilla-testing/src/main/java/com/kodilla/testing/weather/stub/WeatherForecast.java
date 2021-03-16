package com.kodilla.testing.weather.stub;

import java.math.BigDecimal;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public Double calculateAverageTemperature(){
        Double sum = 0.0;
        for (Map.Entry<String,Double> i : temperatures.getTemperatures().entrySet()){
            sum += i.getValue();
        }
        return sum/temperatures.getTemperatures().size();
    }
    public Double calculateMedianOfTemperature(){
        Double median;
        List<Double> temperaturesValue = new ArrayList<>();
        for (Map.Entry<String,Double> i : temperatures.getTemperatures().entrySet()){
            temperaturesValue.add(i.getValue());
        }
        Collections.sort(temperaturesValue);
        if(temperaturesValue.size()%2==0){
            median = (temperaturesValue.get((temperaturesValue.size()/2)-1)+temperaturesValue.get((temperaturesValue.size()/2)))/2;
        }
        else if(temperaturesValue.size()%2!=0){
            median = temperaturesValue.get(temperaturesValue.size()/2);
        }
        else {
            return -1.0;
        }
        return median;
    }
}
