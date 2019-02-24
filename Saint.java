import java.io.*;
import java.util.*;

class Saint extends Novice {
    private ArrayList<String> skill;
    private  int damageS1;
    private int damageS2;

    public Saint(Novice prejob){
        super();
        super.setstat(prejob," Saint");
        
        skill = new ArrayList<String>();
        skill.add("thunderbolt");
        skill.add("Heal");
    }


    public void setDamageS1(int damageS1){
        this.damageS1 = damageS1;
    }
    public void getDamageS1(int damageS1){
        this.damageS1 = damageS1 ;
    }

    public void setDamageA2(int damageS2){
        this.damageS2 = damageS2;
    }
    public void getDamageA2(int damageS2){
        this.damageS2 = damageS2 ;
    }

    public int thunderbolt1()
    {
        damageS1 = 140;
        return damageS1;
    }

    public int Heal()
    {
        damageS2 = 150;
        return damageS2;
    }

    }
