import java.awt.print.PrinterJob;
import java.io.*;
import java.util.*;

public class Game {
  boolean gameContinue;
  Novice player;
  public Game(){
    player = new Novice();
    gameContinue = true;
  }

  public static void main(String args[]){
      Game game = new Game();
        
        Scanner input1 = new Scanner(System.in); 
        System.out.println("******************************");
        System.out.println("Hello " + game.player.getName() +"!");
        System.out.println("==============================");    
        while(game.gameContinue){
        System.out.println("==============================");
        System.out.println("Do you want to do");
        System.out.println("==============================");
        System.out.println("Insert 1: Fight");
        System.out.println("Insert 2: Show status");
        System.out.println("Insert 3: Open your bag");
        System.out.println("Insert 4: Quit");
        System.out.println("==============================");
        System.out.print("Answer ::  ");
        int todo = input1.nextInt();
        System.out.println("==============================");
        
        if(todo != 4){
          game.player.check(todo);
          if(todo == 2){
            System.out.println("=============================="); 
            System.out.println("Your job is "+ game.player.getJob() );
            System.out.println("You have Patk is "+ game.player.getPatk());
            System.out.println("You have exp is "+ game.player.getExp());
            System.out.println("You have level is "+ game.player.getLevel());
            System.out.println("You have hp is "+game.player.getHp()+"/"+ game.player.getHpmax());
            System.out.println("==============================");
          }
        }
        else if(todo == 4){
          game.gameContinue = false;
        }
        
        
        if(game.player.getLevel() >= 5 && game.player.getJob().equals("Novice") ){

          System.out.println("You can choose job!!!");
          System.out.println("Insert 1: Archer");
          System.out.println("Insert 2: Saint");
          System.out.println("==============================");
          System.out.print("Do you want a job ? ::  ");
          int todo1 = input1.nextInt();
          game.changejob(todo1, game.player);
        }
      }      
  }

  public void changejob(int todo1, Novice player){
    if ( todo1 == 1){
         this.player = new Archer(player);
        }
    else if ( todo1 == 2){
        this.player = new Saint(player);
        } 
      }

}