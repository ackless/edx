import java.util.Scanner;
import java.lang.String;

public class color {
    public static void main(String args[]){
        color();
    }

    public static void color(){
        String userChoose;
        Scanner input = new Scanner(System.in);
        System.out.print("What color do you want? ");
        userChoose = input.nextLine();
        if (userChoose.toUpperCase().substring(0, 1).equals("R") && userChoose.length()<=1){
                System.out.println("You have chosen Red.");
            }
        else if(userChoose.toUpperCase().substring(0, 1).equals("G") && userChoose.length()<=1){
                System.out.println("You have chosen Green.");
            }
        else if(userChoose.toUpperCase().substring(0, 1).equals("B") && userChoose.length()<=1){
                System.out.println("You have chosen Blue.");
            }
        else{
            System.out.println("Unknown color: " + userChoose);
        }
    }

}
