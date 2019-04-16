package version1;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Clock extends Observable {
	int time = 0;

	public void start() throws InterruptedException {
		for (;;) {
			time++;
			setChanged();
			notifyObservers();
			Thread.sleep(1000);
		}
	}
	
	public int getTime() {
		return time;
	}
}
