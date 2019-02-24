import java.io.*;
import java.util.*;

class Archer extends Novice {
    private ArrayList<String> skill;
    private  int damageA1;
    private int damageA2;

    public  Archer(Novice prejob){
        super();
        super.setstat(prejob,"Archer");

        skill = new ArrayList<String>();
        skill.add("Chargeshot");
        skill.add("Arrowstorm");        
    }

    public void setDamageA1(int damageA1){
        this.damageA1 = damageA1;
    }
    public void getDamageA1(int damageA1){
        this.damageA1 = damageA1 ;
    }


    public void setDamageA2(int damageA2){
        this.damageA2 = damageA2;
    }
    public void getDamageA2(int damageA2){
        this.damageA2 = damageA2 ;
    }

    public int Chargeshot()
    {
        damageA1 = 160;
        return damageA1;
    }

    public int Arrowstorm()
    {
        damageA2 = 180;
        return damageA2;
    }


}