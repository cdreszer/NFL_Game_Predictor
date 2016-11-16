package model;

import java.io.Serializable;
import java.util.HashSet;

/**
 * Created by chasedreszer on 11/15/16.
 */
public class Week implements Serializable, Comparable<Week> {

   public static final long serialVersionUID = 42L;

   private int weekNumber = 0;
   private HashSet<Game> games = new HashSet<>();

   public Week(int weekNumber, HashSet<Game> games) {
      this.weekNumber = weekNumber;
      this.games = games;
   }

   public int getWeekNumber() {
      return weekNumber;
   }

   public void setWeekNumber(int weekNumber) {
      this.weekNumber = weekNumber;
   }

   public HashSet<Game> getGames() {
      return games;
   }

   public void setGames(HashSet<Game> games) {
      this.games = games;
   }

   @Override
   public int compareTo(Week other) {
      return ((Integer)this.getWeekNumber()).compareTo(other.getWeekNumber());
   }
}
