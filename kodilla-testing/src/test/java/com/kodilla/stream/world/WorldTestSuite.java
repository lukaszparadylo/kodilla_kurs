package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {

    private static BigDecimal allPeople = BigDecimal.ZERO;
    private Set<Country> countryListGenerator(int numberOfCountries, int maxQuantityOfPeople){
        Set<Country> tempCountryList = new HashSet<>();
        Random randomQuantityOfPeople = new Random();
        BigDecimal randomPeopleQuantity = BigDecimal.ZERO;
        for (int i = 0; i<numberOfCountries; i++){
            randomPeopleQuantity = randomPeopleQuantity.add(BigDecimal.valueOf(randomQuantityOfPeople.nextInt(maxQuantityOfPeople)));
            tempCountryList.add(new Country(randomPeopleQuantity));
            this.allPeople = this.allPeople.add(randomPeopleQuantity);
        }
        return tempCountryList;
    }
    @BeforeEach
    private void prepareData(){
        allPeople = BigDecimal.ZERO;
    }
    @DisplayName("Wen is 0 people in all countries")
    @Test
    public void testGetPeopleQuantity(){
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();
        Continent continent6 = new Continent();
        Continent continent7 = new Continent();
        continent1.addCountry(countryListGenerator(0,0));
        continent2.addCountry(countryListGenerator(0,0));
        continent3.addCountry(countryListGenerator(0,0));
        continent4.addCountry(countryListGenerator(0,0));
        continent5.addCountry(countryListGenerator(0,0));
        continent6.addCountry(countryListGenerator(0,0));
        continent7.addCountry(countryListGenerator(0,0));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);
        System.out.println("People list in "+this.getClass().getSimpleName()+": "+allPeople);

        Assertions.assertEquals(this.allPeople,world.getPeopleQuantity());
    }
    @DisplayName("There are some people and 0 countries")
    @Test
    public void testGetPeopleQuantity2persons(){
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();
        Continent continent6 = new Continent();
        Continent continent7 = new Continent();
        continent1.addCountry(countryListGenerator(0,2));
        continent2.addCountry(countryListGenerator(0,2));
        continent3.addCountry(countryListGenerator(0,2));
        continent4.addCountry(countryListGenerator(0,2));
        continent5.addCountry(countryListGenerator(0,2));
        continent6.addCountry(countryListGenerator(0,2));
        continent7.addCountry(countryListGenerator(0,2));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);
        world.addContinent(continent6);
        world.addContinent(continent7);
        System.out.println("People list in "+this.getClass().getSimpleName()+": "+allPeople);

        Assertions.assertEquals(this.allPeople,world.getPeopleQuantity());

    }
    @DisplayName("There are 2 people and 2 countries")
    @Test
    public void testGetPeopleQuantity2countriesMax2PersonInOneCountry(){
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();
        Continent continent6 = new Continent();
        Continent continent7 = new Continent();
        continent1.addCountry(countryListGenerator(2,2));
        continent2.addCountry(countryListGenerator(2,2));
        continent3.addCountry(countryListGenerator(2,2));
        continent4.addCountry(countryListGenerator(2,2));
        continent5.addCountry(countryListGenerator(2,2));
        continent6.addCountry(countryListGenerator(2,2));
        continent7.addCountry(countryListGenerator(2,2));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);
        world.addContinent(continent6);
        world.addContinent(continent7);
        System.out.println("People list in "+this.getClass().getSimpleName()+": "+allPeople);

        Assertions.assertEquals(this.allPeople,world.getPeopleQuantity());
    }
    @DisplayName("There are 1_000_000_000 people and 2 countries")
    @Test
    public void testGetPeopleQuantity2countriesMax1_00_000_000PersonInOneCountry(){
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();
        Continent continent6 = new Continent();
        Continent continent7 = new Continent();
        continent1.addCountry(countryListGenerator(2,1_000_000_000));
        continent2.addCountry(countryListGenerator(2,1_000_000_000));
        continent3.addCountry(countryListGenerator(2,1_000_000_000));
        continent4.addCountry(countryListGenerator(2,1_000_000_000));
        continent5.addCountry(countryListGenerator(2,1_000_000_000));
        continent6.addCountry(countryListGenerator(2,1_000_000_000));
        continent7.addCountry(countryListGenerator(2,1_000_000_000));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);
        world.addContinent(continent6);
        world.addContinent(continent7);
        System.out.println("People list in "+this.getClass().getSimpleName()+": "+allPeople);

        Assertions.assertEquals(this.allPeople,world.getPeopleQuantity());
    }
    @DisplayName("There are 1_000_000_000 people and 1000 countries")
    @Test
    public void testGetPeopleQuantity1000countriesMax1_00_000_000PersonInOneCountry(){
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();
        Continent continent6 = new Continent();
        Continent continent7 = new Continent();
        continent1.addCountry(countryListGenerator(1000,1_000_000_000));
        continent2.addCountry(countryListGenerator(1000,1_000_000_000));
        continent3.addCountry(countryListGenerator(1000,1_000_000_000));
        continent4.addCountry(countryListGenerator(1000,1_000_000_000));
        continent5.addCountry(countryListGenerator(1000,1_000_000_000));
        continent6.addCountry(countryListGenerator(1000,1_000_000_000));
        continent7.addCountry(countryListGenerator(1000,1_000_000_000));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);
        world.addContinent(continent6);
        world.addContinent(continent7);
        System.out.println("People list in "+this.getClass().getSimpleName()+": "+allPeople);

        Assertions.assertEquals(this.allPeople,world.getPeopleQuantity());
    }
}
