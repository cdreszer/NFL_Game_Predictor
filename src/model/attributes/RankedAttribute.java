package model.attributes;

/**
 * @author cdreszer
 * @version 11/15/16.
 */
public class RankedAttribute implements Attribute{
   // Classifies offensive and defensive ranks
   public static final int GOOD = 3;   // 1-10
   public static final int AVERAGE = 2; // 11-21
   public static final int BAD = 1; // 22-32
   public static final int GOOD_CUTOFF = 11;
   public static final int AVERAGE_CUTOFF = 22;

   private int rank;

   public RankedAttribute(int rank) {
      assert rank > 0;
      this.rank = rank;
   }

   public int getRank() {
      return rank;
   }

   public void setRank(int rank) {
      this.rank = rank;
   }

   @Override
   public int getCategorizedValue() {
      int cRank;

      if (rank < GOOD_CUTOFF) {
         cRank = GOOD;
      }
      else if (rank < AVERAGE_CUTOFF) {
         cRank = AVERAGE;
      }
      else {
         cRank = BAD;
      }

      return cRank;
   }

   @Override
   public double getDiscreteValue() {
      return rank;
   }
}
