import java.io.*;
import java.util.*;
//This interface will be the base of the two games.
public  interface Game {
  // The BufferedReader used 
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  // The random number generator used throughout
  public static RandomInterface r=new LinearCongruentialGenerator();
  //Outline the base functions used in both the games that are functionally identical.
  public void initialiseGame();
  public void mainGame();
  public void declareGameWinner();
  public void playGame();

}

