package com.raj.designpatterns.observer.weather;

import com.raj.designpatterns.observer.core.Observer;
import com.raj.designpatterns.observer.core.Subject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherData implements Subject {
	private final List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// Thread-safe list prevents ConcurrentModificationException
		// if observers are added/removed while iterating.
		observers = new CopyOnWriteArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
