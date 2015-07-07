package com.peter.tennis;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//[1] Scores from zero to three points are described as “love”, “fifteen”, “thirty”, and “forty” respectively. 
//[2] If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is “advantage” for the player in the lead. 
//[3] If at least three points have been scored by each player, and the scores are equal, the score is “deuce”. 
//[4] A game is won by the first player to have won at least four points in total and at least two points more than the opponent.

//http://technologyconversations.com/2014/04/23/java-tutorial-through-katas-tennis-game-easy/

public class TennisGameTest {

  TennisGame tennisGame;
  Player pete; 
  Player suzy;
  
  @Before
  public void setUp(){
    pete = new Player("pete");
    suzy = new Player("suzy");
    tennisGame = new TennisGame(pete, suzy);
  }

  @Test
  public void shouldScoreLoveAll(){
    assertEquals("pete:love suzy:love", tennisGame.score());
  }
  
  @Test
  public void shouldScoreFifteenAll(){
    tennisGame.addPoint(pete,1);
    tennisGame.addPoint(suzy,1);
    assertEquals("pete:fifteen suzy:fifteen", tennisGame.score());
  }
  @Test
  public void shouldScoreFifteenThirty(){
    tennisGame.addPoint(pete,2);
    tennisGame.addPoint(suzy,1);
    assertEquals("pete:thirty suzy:fifteen", tennisGame.score());
  }  
  @Test
  public void shouldScoreFifteenForty(){
    tennisGame.addPoint(pete,3);
    tennisGame.addPoint(suzy,1);
    assertEquals("pete:forty suzy:fifteen", tennisGame.score());
  }   
  @Test
  public void shouldScoreFifteenLove(){
    tennisGame.addPoint(pete,1);
    assertEquals("pete:fifteen suzy:love", tennisGame.score());
  }

  @Test
  public void shouldScoreAdvantagePete(){
    tennisGame.addPoint(pete,4);
    tennisGame.addPoint(suzy,3);    
    assertEquals("advantage pete", tennisGame.score());
  }
  @Test
  public void shouldScoreAdvantageSuzy(){
    tennisGame.addPoint(pete,4);
    tennisGame.addPoint(suzy,5);    
    assertEquals("advantage suzy", tennisGame.score());
  } 
  
  @Test
  public void shouldScoreDuece(){
    tennisGame.addPoint(pete,5);
    tennisGame.addPoint(suzy,5);    
    assertEquals("duece", tennisGame.score());
  }
  @Test
  public void shouldBeGamePete(){
    tennisGame.addPoint(pete,6);
    tennisGame.addPoint(suzy,4);    
    assertEquals("game pete", tennisGame.score());
  }
  @Test
  public void shouldBeGameSuzy(){
    tennisGame.addPoint(pete,6);
    tennisGame.addPoint(suzy,8);    
    assertEquals("game suzy", tennisGame.score());
  }  
}
