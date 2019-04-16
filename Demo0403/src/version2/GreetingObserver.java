package version2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GreetingObserver implements PropertyChangeListener {

   @Override
   public void propertyChange(PropertyChangeEvent evt) {
      System.out.println("Hello!");
   }

}
