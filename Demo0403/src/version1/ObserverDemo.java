package version1;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {

   public static void main(String[] args) throws InterruptedException {
      Clock clock = new Clock();

      clock.addObserver(new GreetingObserver());
      
      clock.addObserver(new PrintObserver());

      // Anonymous class
      clock.addObserver(new Observer() {

         @Override
         public void update(Observable arg0, Object arg1) {
            System.out.println("This is the anonymous observer");
         }

      });

      // Anonymous function -- "lambda"
      clock.addObserver((arg0, arg1) -> {
         System.out.println("Lambda observer");
      });

      clock.start();
   }

}
