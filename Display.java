package Project_1_DragonCave;
import java.util.Scanner;
public class Display {
    public void displayIntro(){
        System.out.println("You are in a land of Full of Dragons. In Front of you,\n you see two caves. In one cave, the dragon is friendly\n and will share his treasure with you . The other dragon\n is greedy and hungry, and will eat you on sight.");
        System.out.println();
    }
    public int chooseCave() {
        Scanner reader = new Scanner(System.in);
        System.out.print(" Which cave will you go into ? ( 1 or 2)");
        int choice = reader.nextInt();
        while(choice !=1 && choice !=2){
            System.out.println("only 1 or 2 are allowed ");
            System.out.print("Which cave will you go into? (1 or 2)");
            choice= reader.nextInt();
        }
        System.out.println();
        return choice;

    }
    public void showResult(boolean isPlayerWin){

        System.out.println("You Approach the cave... \nIt is dark and spooky...,\nA large dragon jumps out in front of you! He opens his jaws and ....");
        if (isPlayerWin){
            System.out.println("gives you the treasure, this is friendly Dragon");
        }else {
            System.out.println("Gobbles you down in one bite!");
        }
    }
}

