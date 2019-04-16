package version1;
import java.util.Observable;
import java.util.Observer;

public class PrintObserver implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		Clock c = (Clock) arg0;
		int time = c.getTime();
		System.out.println("The time is " + time);
	}

}
