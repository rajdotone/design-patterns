package com.raj.designpatterns.observer.weather;

import com.raj.designpatterns.observer.core.Observer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class WeatherDataTest {
    private WeatherData weatherData;

    @BeforeEach
    void setUp() {
        weatherData = new WeatherData();
    }

    @Test
    void testObserverRegistrationAndNotification() {
        // 1. Arrange: Create a mock observer
        Observer mockObserver = mock(Observer.class);
        weatherData.registerObserver(mockObserver);

        // 2. Act: Change the measurements
        weatherData.setMeasurements(80.0f, 65.0f, 30.4f);

        // 3. Assert: Verify the observer was updated with correct values exactly once
        verify(mockObserver, times(1)).update(80.0f, 65.0f, 30.4f);
    }

    @Test
    void testRemoveObserver() {
        // 1. Arrange
        Observer mockObserver = mock(Observer.class);
        weatherData.registerObserver(mockObserver);
        weatherData.removeObserver(mockObserver);

        // 2. Act
        weatherData.setMeasurements(80.0f, 65.0f, 30.4f);

        // 3. Assert: Verify the observer was NOT called after being removed
        verify(mockObserver, never()).update(anyFloat(), anyFloat(), anyFloat());
    }
}
