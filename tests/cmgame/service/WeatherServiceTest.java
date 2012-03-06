package cmgame.service;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WeatherServiceTest {

    @Test
    public void shouldHaveCurrentWeather() throws Exception {
        WeatherService unit = new WeatherServiceImpl();
        assertNotNull(unit.getCurrentWeather());
    }

}
