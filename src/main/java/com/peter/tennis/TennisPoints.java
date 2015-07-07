package com.peter.tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisPoints {

  public static final String FORTY = "forty";
  public static final String THIRTY = "thirty";
  public static final String FIFTEEN = "fifteen";
  public static final String LOVE = "love";
  
  private Map<Integer, String> scores = new HashMap<Integer, String>();
  private int currentScore;

  public TennisPoints() {
    scores.put(0, LOVE);
    scores.put(1, FIFTEEN);
    scores.put(2, THIRTY);
    scores.put(3, FORTY);

    currentScore = 0;
  }

  public void addPoint(final int points) {
    currentScore = currentScore + points;
  }

  public String score() {
    return scores.get(currentScore);
  }
  
  public int getPoints(){
    return currentScore;
  }
}
