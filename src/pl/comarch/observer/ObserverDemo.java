package pl.comarch.observer;

/*
 * Wzorzec Observer - sluzy do zawiadomienia zainteresowanych obiektow o zmianie stanu innego obiektu. Przykladowo, w ponizszym przykladzie Zeglarze sa zawiadamiani, gdy zmieni sie PrognozaWiatru.
 */

import java.util.ArrayList;
import java.util.List;

interface Observer{
	public void update(int wind);
}

interface Observable{
	public void addObserver(Observer obs);
	public void removeObserver(Observer obs);
	public void notifyObservers();
}


class WeatherForecast implements Observable{
	private List<Observer> observers = new ArrayList<Observer>();
	private int wind;
	
	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observers){
			obs.update(this.getWind());
		}
	}

	public int getWind() { return wind;	}
	public void setWind(int wind) {
		this.wind = wind;
		notifyObservers();
	} 	
}


class Sailor implements Observer{
	private String phoneNumber;
	
	public Sailor(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	
	@Override
	public void update(int wind) {
		sendSMS(wind);
	}
	
	private void sendSMS(int wind){
		System.out.println("Wysylam wiadomosc na numer " + this.phoneNumber + ", najnowsza prognoza wiatru to " + wind);
	}
}


public class ObserverDemo {

	public static void main(String[] args) {
		WeatherForecast weatherForecast = new WeatherForecast();
		
		Sailor s1 = new Sailor("111111111");
		weatherForecast.addObserver(s1);
		
		Sailor s2 = new Sailor("222222222");
		weatherForecast.addObserver(s2);
		
		weatherForecast.setWind(5);
		weatherForecast.setWind(8);
	}
}
