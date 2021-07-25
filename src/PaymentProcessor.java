import java.util.Scanner;

public class PaymentProcessor {

    PaymentProcessor(Candy candy) {
        CheckPayment(candy);
    }

    private void CheckPayment(Candy candy) {
        System.out.println("Please insert payment of: " + candy.getUnitCost());
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();

        while(payment != 0){
            if (payment == candy.getUnitCost()) {
                System.out.println("Thank you");
                candy.dispenseCandy();
                payment = 0;
            } else {
                System.out.println("Please try again or press 0 to start over");
                payment = scan.nextInt();
            }
        }
    }
}
