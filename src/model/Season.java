package model;

import java.io.Serializable;
import java.util.TreeSet;

/**
 * Created by chasedreszer on 11/15/16.
 */
public class Season implements Serializable {

   public static final long serialVersionUID = 42L;

   private TreeSet<Week> weeks = new TreeSet<>();

   public Season() {
      this.weeks = new TreeSet<>();
   }

   public Season(TreeSet<Week> weeks) {
      this.weeks = weeks;
   }


}
