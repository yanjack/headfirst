package headfirst.demo.test;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import headfirst.demo.adapter.TuckeyAdapter;
import headfirst.demo.adapter.WlidTurkey;
import headfirst.demo.command.BedRoomLight;
import headfirst.demo.command.LightOnCommand;
import headfirst.demo.command.SimpleRemoteControl;
import headfirst.demo.decorate.Beverage;
import headfirst.demo.decorate.DarkRoast;
import headfirst.demo.decorate.Mocha;
import headfirst.demo.decorate.Whip;
import headfirst.demo.observer.ObserverTest;
import headfirst.demo.observer.ObserverTest2;
import headfirst.demo.observer.WeatherData;
import headfirst.demo.strategy.Duck;
import headfirst.demo.strategy.FlyNoWay;
import headfirst.demo.strategy.MallardDuck;

public class Test {
	public static void main(String[] args) {
		//strategy策略者
		Duck duck=new MallardDuck();
		duck.setFlyBehavoir(new FlyNoWay());
		duck.performFly();
		
		//观察者
		WeatherData subject=new WeatherData();
		subject.addObserver(new ObserverTest());
		subject.addObserver(new ObserverTest2());
		subject.measurementsChanged(12.3f, 11.3f, 10.3f);
		
		//装饰器
		Beverage beverage=new Mocha(new Whip(new Mocha(new DarkRoast())));
		System.out.println(beverage.cost());
//		try {
//			InputStream in=new LowerCaseInputStream(new FileInputStream
//					(new File("E:/yl/workspace_svn_pp/headfirst/src/headfirst/demo/decorate/IOTest")));
//			int c;
//			while((c=in.read())>=0){
//				System.out.println((char)c);
//			}
//			in.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		Map<String,String> map=new HashMap<>();
//		Map<String,String> map2=new Hashtable<>();
		
		//命令模式
		SimpleRemoteControl remoteControl=new SimpleRemoteControl();
		remoteControl.setCommand(new LightOnCommand(new BedRoomLight()));
		remoteControl.buttonWasPressed();
		
		//装饰器适配
		Duck adapter=new TuckeyAdapter(new WlidTurkey());
		adapter.performFly();
		adapter.performQuack();
		List list=new ArrayList<>();
		List list2=new LinkedList<>();
		File file=new File("E:/yl/workspace_svn_pp/headfirst/src/headfirst/demo/decorate");
		System.out.println(file.list());
		File[] path =file.listFiles();
		System.out.println("切割后的===>"+path);
	}
}
