package Project_1_DragonCave;
import java.util.Random;
public class Cave {
    public int chooseCave(){
        Random rand=new Random();
        int treasureCaveNo=rand.nextInt(3);
        return treasureCaveNo;
    }
    public boolean resolveChoice (int choice){
        int treasureCaveNo=chooseCave();

        return choice == treasureCaveNo;
    }
}
