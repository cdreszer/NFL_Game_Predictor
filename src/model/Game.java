package model;

import model.attributes.Attribute;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents an NFL game, made up of two teams and an outcome.
 *
 * @author cdreszer
 * @version 11/15/16.
 */
public class Game implements Serializable {

   public static final long serialVersionUID = 42L;

   // # of attributes to determine category (WIN/LOSS/TIE)
   public static final int TOTAL_NUM_ATTRIBUTES = 12;

   // Used to categorizes win/loss/tie
   public static final int HOME_TEAM_WINS = 0;
   public static final int AWAY_TEAM_WINS = 1;
   public static final int TIE = 2;
   public static final int UNKNOWN = -1;

   private Team homeTeam;
   private Team awayTeam;
   private int winner;

   public Game(Team homeTeam, Team awayTeam) {
      this.homeTeam = homeTeam;
      this.awayTeam = awayTeam;
      this.winner = UNKNOWN;
   }

   public Game(Team homeTeam, Team awayTeam, int winner) {
      this.homeTeam = homeTeam;
      this.awayTeam = awayTeam;
      this.winner = winner;
   }

   public Team getHomeTeam() {
      return homeTeam;
   }

   public void setHomeTeam(Team homeTeam) {
      this.homeTeam = homeTeam;
   }

   public Team getAwayTeam() {
      return awayTeam;
   }

   public void setAwayTeam(Team awayTeam) {
      this.awayTeam = awayTeam;
   }

   public int[] getCategorizedRow() {
      // Last value is categorization
      int[] row = new int[TOTAL_NUM_ATTRIBUTES + 1];
      int col = 0;

      for (Attribute att : homeTeam.getAttributes()) {
         row[col] = att.getCategorizedValue();
         col++;
      }

      for (Attribute att : awayTeam.getAttributes()) {
         row[col] = att.getCategorizedValue();
         col++;
      }

      row[col] = winner;

      return row;
   }

   public double[] getDiscreteRow() {
      // Last value is categorization
      double[] row = new double[TOTAL_NUM_ATTRIBUTES + 1];
      int col = 0;

      for (Attribute att : homeTeam.getAttributes()) {
         row[col] = att.getDiscreteValue();
         col++;
      }

      for (Attribute att : awayTeam.getAttributes()) {
         row[col] = att.getDiscreteValue();
         col++;
      }

      row[col] = winner;

      return row;
   }
}
