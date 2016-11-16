package model.attributes;

/**
 * @author cdreszer
 * @version 11/15/16.
 */
public class WinPercentage implements Attribute{

   public static final int ABOVE_500 = 1;
   public static final int BELOW_500 = 0;

   private double winPercentage;

   public WinPercentage(double winPercentage) {
      assert winPercentage >= 0 && winPercentage <= 1;
      this.winPercentage = winPercentage;
   }

   @Override
   public int getCategorizedValue() {
      int cWP;

      if (winPercentage >= .5) {
         cWP = ABOVE_500;
      }
      else {
         cWP = BELOW_500;
      }

      return cWP;
   }

   @Override
   public double getDiscreteValue() {
      return winPercentage;
   }
}
