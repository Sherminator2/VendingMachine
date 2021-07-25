import java.util.Scanner;

public class MenuChoice {

    private static int Choice(){
        int choice;
        Scanner myObj = new Scanner(System.in);
         choice = myObj.nextInt();
        return choice;
    }
}
