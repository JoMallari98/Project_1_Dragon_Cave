package Project_1_DragonCave;

public class Trial {
    public static void main(String[] args){

        Display ui=new Display();
        Cave cave= new Cave();

        ui.displayIntro();
        int choice=ui.chooseCave();
        boolean isPlayerwin=cave.resolveChoice(choice);
        ui.showResult(isPlayerwin);
    }
}
