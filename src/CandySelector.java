import java.util.Scanner;

public class CandySelector {

    private static int menu(){
        int menuChoice;
        Scanner myObj = new Scanner(System.in);
         menuChoice = myObj.nextInt();
        return menuChoice;
    }
    public CandySelector(){
        CreateCandy dispense = new CreateCandy(menu());
    }
}
