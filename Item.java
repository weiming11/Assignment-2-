import java.io.*;
import java.util.*;

public class Item {
     String nameitem;
     
     public Item comp(int idOfitems) {

          Item newitems = new Item();
          if(idOfitems == 0)
          {
               newitems. nameitem =  "Axe" ; 
          }
          else if (idOfitems == 1)
          {
               newitems. nameitem =  "Bow" ;
          }
          else if (idOfitems == 2)
          {
               newitems. nameitem =  "Sword" ;
          }
          else if(idOfitems == 3)
          {
               newitems.nameitem = "potion20hp" ;
          }
          else if(idOfitems == 4)
          {
               newitems.nameitem = "potion70hp" ;
          }

          return newitems ;
      }
      
      public Item RandItems(){
          int idOfitem;
          int idkhp;
          Item Dropitem = new Item();

          idOfitem = (int)(Math.random()*4) ;
        
          Dropitem = Dropitem.comp(idOfitem);
          return Dropitem;
      }
}