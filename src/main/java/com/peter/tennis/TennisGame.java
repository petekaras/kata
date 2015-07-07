package com.peter.tennis;

public class TennisGame {

  private Player player1;
  private Player player2;

  public TennisGame(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void addPoint(Player player,int points) {
    player.addPoint(points);
  }
  


  public String score() {
    int player1Points = player1.getPoints();
    int player2Points = player2.getPoints();
    
   
    if(player1Points >= 3 && player2Points >=3){
      if(Math.abs(player1Points - player2Points) == 2){
        if(player1Points>player2Points) return "game " + player1.getName();
        return "game " + player2.getName();
      }
      
      if(player1Points == player2Points) return "duece";
      if(player1Points > player2Points) return "advantage " + player1.getName();
      return "advantage " + player2.getName(); 

    }
    return player1.getName() + ":" + player1.score() + " " + player2.getName() + ":" + player2.score() ;
  }
}
