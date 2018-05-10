package aplicacao;


import java.util.Observable;
import java.util.Observer;

import fachada.Fachada;
import model.WeatherData;

public class Teste implements Observer{
	
	public static void main(String[] args) {
			
		Fachada.register(new Teste());
		Fachada.updatePrevision();
		   
		
	}
	
	@Override
	public void update(Observable weather, Object arg1) {
		if (weather instanceof WeatherData){
			WeatherData prev = (WeatherData) weather;
			System.out.println(prev.toString());
		}else{
			System.out.println("Algo de errado não está certo!!!");
		}
		
	}

}
