package model.attributes;

/**
 * @author cdreszer
 * @version 11/15/16.
 */
public class Spread implements Attribute{

   // Vegas odds -> minimize values
   public static final int PREDICTED_WINNER = -1;
   public static final int PREDICTED_LOSER = 1;
   public static final int EVEN = 0;

   private double vegasSpread;

   public Spread(double vegasSpread) {
      this.vegasSpread = vegasSpread;
   }

   @Override
   public int getCategorizedValue() {
      int cSpread;

      if (vegasSpread > 0) {
         cSpread = PREDICTED_LOSER;
      }
      else if (vegasSpread < 0) {
         cSpread = PREDICTED_WINNER;
      }
      else {
         cSpread = EVEN;
      }

      return cSpread;
   }

   @Override
   public double getDiscreteValue() {
      return vegasSpread;
   }
}
