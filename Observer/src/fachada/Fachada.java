package fachada;


import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observer;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import model.WeatherData;

public class Fachada {
	

	private static WeatherData previsao = new WeatherData(25, 0.9, 10);
	
	public static void register (Observer view){
		previsao.addObserver(view);
		previsao.measurementsChanged();
	}
	
	public static void updatePrevision (){
		
		URL url;
		try {
			url = new  URL("http://apiadvisor.climatempo.com.br/api/v1/weather/locale/7364/current?token=a15beee4595308e1cbc357f733030057");
			
			try (
					
					InputStream is = url.openStream();
			        
					JsonReader rdr = Json.createReader(is)) {
			        JsonObject obj = rdr.readObject();
			        JsonObject obj2 = obj.getJsonObject("data");
			        String temperatura = obj2.getJsonNumber("temperature").toString();
			        String humidade = obj2.getJsonNumber("humidity").toString();
			        String pressao = obj2.getJsonNumber("pressure").toString();
			        
			        Double temp = Double.parseDouble(temperatura);
			        Double hum = Double.parseDouble(humidade);
			        Double press = Double.parseDouble(pressao);
			        
			        previsao.setTemperature(temp);
			        previsao.setHumidity(hum);
			        previsao.setPressure(press);
			        previsao.measurementsChanged();
			        
			   }catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
