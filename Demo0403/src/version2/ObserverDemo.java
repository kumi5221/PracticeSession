package version2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ObserverDemo {

   public static void main(String[] args) throws InterruptedException {
      Clock clock = new Clock();

      clock.addObserver(new GreetingObserver());
      
      clock.addObserver(new PrintObserver());

      // Anonymous class
      clock.addObserver(new PropertyChangeListener() {
         
         @Override
         public void propertyChange(PropertyChangeEvent evt) {
            System.out.println("This is the anonymous observer");
         }
      });

      // Anonymous function -- "lambda"
      clock.addObserver((evt) -> {
         System.out.println("Lambda observer");
      });

      clock.start();
   }

}
