package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }


        private City mockCity () {
            return new City("Edmonton", "Alberta");
        }

        @Test
        public void doubleCountAssertion () {
            CityList cityList = mockCityList();

            cityList.add(new City("Regina", "Saskatchewan"));

            assertEquals(4, cityList.countDoubleCities());
        }
}

