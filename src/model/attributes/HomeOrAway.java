package model.attributes;

/**
 * @author cdreszer
 * @version 11/15/16.
 */
public class HomeOrAway implements Attribute{

   public static final int HOME_TEAM = 0;
   public static final int AWAY_TEAM = 1;

   private int homeOrAway;

   public HomeOrAway(int homeOrAway) {
      this.homeOrAway = homeOrAway;
   }

   @Override
   public int getCategorizedValue() {
      return homeOrAway;
   }

   @Override
   public double getDiscreteValue() {
      return homeOrAway;
   }
}
