import java.io.*;
import java.util.*;

public class Novice {
    
    private int hp;
    private int hpmax;
    private int exp;
    private int level;
    private String job;
    private String name;
    private int patk;
    Bag bag ;

    public Novice(){
        hp = 1000 ;
        hpmax = 1000 ;
        exp = 0 ;
        level = 1 ;
        job = "Novice";
        name="Donut" ;
        patk = 100 ;
        bag = new Bag();
    }

    public int getHp(){
        return hp;
    }
    public void setHp (int hp){
        this.hp = hp;
    }

    public int getHpmax(){
        return hpmax;
    }
    public void setHpmax (int hpmax){
        this.hpmax = hpmax;
    }

    public int getExp(){
        return exp;
    }
    public void setExp (int exp){
        this.exp = exp;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel (int level){
        this.level = level;
    }

    public String getJob(){
        return job;
    }
    public void setJob (String job){
        this.job = job;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public int getPatk(){
        return patk;
    }
    public void setPatk (int patk){
        this.patk = patk;
    }

    public void monster(int num)
    {
         int ArcherHp = 500;
         int BarbarianHp = 650;

         if(num == 1){
         while(true){
          if(ArcherHp > 0){
              ArcherHp = ArcherHp - patk ;     
              hp = hp-30;
            }
           else {
              break;
            }
         }
         exp = exp+70;
         System.out.println("==============================");
         System.out.println("Archer dead");
         System.out.println("-----You get-----");
         bag.dropitem();
         
         }

        else if(num == 2){
            while(true){
                if(BarbarianHp > 0){
                BarbarianHp = BarbarianHp - patk ;     
                hp = hp-40;
                }
                 else {
                  break;
                }
         }
         
         exp = exp+90;
         System.out.println("==============================");
         System.out.println("Barbarian dead");
         System.out.println("-----You get-----");
         bag.dropitem();
         
        }
        System.out.println("********"+bag.items.get(bag.slot - 1).nameitem+"********");
        hp();
        checklevel();
    
    }

      
    public void checklevel(){
            while(exp >= 100){
            exp = exp-100;
            level = level+1;
            hpmax = hpmax + 100;
         }
    }

    public void potion(int numpo){
         hp = hp  +(numpo*200);
         if(hp>hpmax){
             hp = hpmax;
         }
    }
    
    public void check(int todo){
        if(todo == 1){
            fight();
        }
        else if (todo == 3) {
            bag.openbag();
            System.out.print("Potion20hp: ");
            new Potion20hp().print();
            System.out.print("Potion70hp: ");
            new Potion70hp().print();
        }
    
    }

    public void fight(){
        int j=1;
        Scanner input2 = new Scanner(System.in); 
        System.out.println("==============================");
        System.out.println("**Let's go**"); 
        System.out.println("This area have monster");
        System.out.println("Insert 1:Archer");
        System.out.println("Insert 2:Barbarian");
        System.out.println("==============================");
        System.out.println("Which monster do you want to fight with?(1 or 2)"+"#"+j);
        System.out.println("==============================");
        int number = input2.nextInt();
        monster(number);
        System.out.println("==============================");
        j++;
        
    }
   public void hp(){
       if(hp <= 0){
        hp = 0 ;
        System.out.println("You died");
        
       }
       else if(hp  < 200) {
        System.out.println("You should use potion");   
       }
   }

   public void setstat(Novice prejob,String nextJob){
     if(nextJob.equals("Archer")){
    
      job = nextJob;
      hp =  hp + 500;
      hpmax = hpmax + 500;
      patk =  patk + 30;
      level = prejob.level;
      exp = prejob.exp;
     }
     else{
        job = nextJob;
        hp =  hp + 800;
        hpmax = hpmax + 800;
        patk =  patk + 10;
        level = prejob.level;
        exp = prejob.exp;
     }

       
}

   }
