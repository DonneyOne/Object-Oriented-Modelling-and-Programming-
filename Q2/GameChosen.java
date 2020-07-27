import java.io.*;
import java.util.*;
//Factory creates a game depending on the user input given in Test's main function
public class GameChosen{
  public Game PickGame(String ans){
    if (ans.equals("c")) {
      CardGame card = new CardGame();
      //Object of a CardGame that would be returned if the answer is card game to be played
      return card;
    }

    else if (ans.equals("d")) {
       DieGame die = new DieGame();
       //Object of a DieGame that would be returned if the answer is die game to be played
       return die;
    }
    else {
      //Null is returned if the user input is incorrect. However that factory allows more games to be added in the future if such games concepts are existent.
      return null;
    }
  }
}