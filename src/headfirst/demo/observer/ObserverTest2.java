package headfirst.demo.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverTest2 implements Observer {
	
	
	public ObserverTest2(Observable observable){
//		this.observable=observable;
		observable.addObserver(this);
	}
	public ObserverTest2(){
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData data= (WeatherData)o;
			System.out.println("气压2："+data.getPressure());
			System.out.println("温度2："+data.getTemperature());
			System.out.println("湿度2："+data.getHumidity());
		}
	}

}
