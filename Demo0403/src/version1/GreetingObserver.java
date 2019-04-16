package version1;
import java.util.Observable;
import java.util.Observer;

public class GreetingObserver implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Hello!");
	}

}
