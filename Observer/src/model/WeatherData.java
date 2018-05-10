package model;

import java.util.Observable;

public class WeatherData extends Observable{
	
	double temperature = 0;
	double humidity = 0;
	double pressure = 0;
	
	public WeatherData (double temperatura, double humidade, double pressao){
		temperature = temperatura;
		humidity = humidade;
		pressure = pressao;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	
	public boolean measurementsChanged(){
		setChanged();
		notifyObservers();
		return true;
	}

	@Override
	public String toString() {
		return "WeatherData [temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}
	
	
}
