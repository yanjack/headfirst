package headfirst.demo.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverTest implements Observer {
	
	
	public ObserverTest(Observable observable){
//		this.observable=observable;
		observable.addObserver(this);
	}
	public ObserverTest(){
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData data= (WeatherData)o;
			System.out.println("气压："+data.getPressure());
			System.out.println("温度："+data.getTemperature());
			System.out.println("湿度："+data.getHumidity());
		}
	}

}
