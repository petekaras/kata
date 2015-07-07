package com.peter.tennis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tennis game
 * 
 * @author peter
 *
 */



public class TennisPointsTest {
  TennisPoints tennisGame;
  @Before
  public void setUp() throws Exception {
    tennisGame = new TennisPoints();
  }

  @Test
  public void shouldScoreLove() {
    assertEquals(TennisPoints.LOVE, tennisGame.score());
  }
  @Test
  public void shouldScoreFifteen() {
    tennisGame.addPoint(1);
    assertEquals(TennisPoints.FIFTEEN, tennisGame.score());
  }  
  @Test
  public void shouldScoreThirty() {
    tennisGame.addPoint(1);
    tennisGame.addPoint(1);
    assertEquals(TennisPoints.THIRTY, tennisGame.score());
  }   
  @Test
  public void shouldScoreForty() {
    tennisGame.addPoint(1);
    tennisGame.addPoint(2);
    assertEquals(TennisPoints.FORTY, tennisGame.score());;
  }
}
