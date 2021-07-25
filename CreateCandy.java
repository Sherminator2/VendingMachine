
public class CreateCandy {

    public CreateCandy(int candyChoice) {
        switch (candyChoice) {
            case 1 -> {
                Candy snickers = new Candy("Snickers", 1, 9);
                System.out.println(snickers);
                new PaymentProcessor(snickers);
                System.out.println(snickers);
            }
            case 2 -> {
                Candy reeses = new Candy("Reeses", 2, 46);
                System.out.println(reeses);
                new PaymentProcessor(reeses);
                System.out.println(reeses);
            }
        }
    }
}
