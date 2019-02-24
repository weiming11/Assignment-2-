import java.io.*;
import java.util.*;

public class Bag {
   
    public ArrayList<Item> items;
    public int limititem ;
    public int slot ;
    public String Itemdrop;

    public Bag() {
          int i ;
          items = new ArrayList<Item>();
          limititem = 100;
          slot = 0 ;
    }

    public void openbag() {
        int i = 1 ;
        System.out.println("This is your bag ");
        while(i-1 < items.size()){
        System.out.println( "(" + i + ")" + items.get(i - 1).nameitem ); 
        i++;    
      }
        }

     public void dropitem(){
        if(slot < limititem){
            items.add(new Item().RandItems());
            slot++;
        }
        else {
          System.out.println("Your bag is FULL!!!!");  
         }
        }
         
    }

    

