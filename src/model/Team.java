package model;

import model.attributes.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 *
 * @author cdreszer
 * @version 11/15/16.
 */
public class Team implements Serializable {

   public static final long serialVersionUID = 42L;

   private String name;
   private WinPercentage winPercentage;
   private WinPercentage prevYearWinPercentage;
   private RankedAttribute offensiveRank;
   private RankedAttribute defensiveRank;
   private Spread vegasSpread;
   private HomeOrAway homeOrAway;

   private ArrayList<Attribute> attributes;

   public Team(String name, WinPercentage winPercentage, WinPercentage prevYearWinPercentage,
               RankedAttribute offensiveRank, RankedAttribute defensiveRank,
               Spread vegasSpread, HomeOrAway homeOrAway) {
      this.name = name;
      this.winPercentage = winPercentage;
      this.prevYearWinPercentage = prevYearWinPercentage;
      this.offensiveRank = offensiveRank;
      this.defensiveRank = defensiveRank;
      this.vegasSpread = vegasSpread;
      this.homeOrAway = homeOrAway;

      this.attributes = new ArrayList<>(Arrays.asList(winPercentage, prevYearWinPercentage, offensiveRank, defensiveRank, vegasSpread, homeOrAway));
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public ArrayList<Attribute> getAttributes() {
      return attributes;
   }

}
