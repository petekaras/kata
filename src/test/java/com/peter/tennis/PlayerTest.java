package com.peter.tennis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
  Player player;
  @Before
  public void setUp() throws Exception {
    player = new Player("pat");
  }

  @Test
  public void shouldScorePoint() {
    player.addPoint(1);
    assertEquals("fifteen", player.score());
  }

}
