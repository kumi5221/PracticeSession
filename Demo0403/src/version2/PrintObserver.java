package version2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PrintObserver implements PropertyChangeListener {

   @Override
   public void propertyChange(PropertyChangeEvent evt) {
      Clock c = (Clock) evt.getSource();
      int time = c.getTime();
      System.out.println("The time is " + time);
   }

}
