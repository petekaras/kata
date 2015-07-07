package com.peter.tennis;

public class Player {
  private String name;
  private TennisPoints points;

  public Player(final String name) {
    this.name = name;
    this.points = new TennisPoints();
  }

  public String getName() {
    return name;
  }

  
  public String score(){
    return points.score();
  }
  
  public void addPoint(final int point){
    points.addPoint(point);
  }
  
  public int getPoints(){
    return points.getPoints();
  }
}
