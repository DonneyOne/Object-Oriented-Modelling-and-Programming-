import java.io.*;
import java.util.*;

public class Test{
	  // The BufferedReader used in all the files.
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws Exception {
    //Declaring factory, so we can create the games in regards to the input.
    GameChosen chosen=new GameChosen();
    System.out.print("Card (c) or Die (d) game? ");
    String ans_user=br.readLine();
    //Create game with the use of the factory.
    Game game_play=chosen.PickGame(ans_user);
    //Check if such game exists. If it doesnt then the program will be terminated, if it does then GameChosen would be called with the input and the game of dies/cards will start.
    if(game_play!=null){
      game_play.playGame();
    }
    else{
      System.out.println("Input not understood ");
        }

    }
}