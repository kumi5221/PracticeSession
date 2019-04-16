package version2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Clock {
   private int time = 0;
   private PropertyChangeSupport support = new PropertyChangeSupport(this);

   public void addObserver(PropertyChangeListener observer) {
      support.addPropertyChangeListener(observer);
   }

   public void start() throws InterruptedException {
      for (;;) {
         setTime(time + 1);
         Thread.sleep(1000);
      }
   }

   public int getTime() {
      return time;
   }
   
   public void setTime(int time) {
      int oldTime = this.time;
      this.time = time;
      support.firePropertyChange("time", oldTime, time);
   }
}
