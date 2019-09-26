package headfirst.demo.single;

/**
 * @author yan lang
 *	懒汉式
 */
public class SingleFull {
	
	private volatile static SingleFull single;
	
	private SingleFull(){}
	public static SingleFull getInstance(){
		if(null==single){
			synchronized (SingleFull.class) {
				if(null==single) single=new SingleFull();
			}
		}
		return single;
	}	
}
