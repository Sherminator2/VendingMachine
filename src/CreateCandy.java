
public class CreateCandy {

    public CreateCandy() {
                Candy snickers = new Candy("Snickers", 1, 9);
                System.out.println(snickers);
                new PaymentProcessor(snickers);
                System.out.println(snickers);

                Candy reeses = new Candy("Reeses", 2, 46);
                System.out.println(reeses);
                new PaymentProcessor(reeses);
                System.out.println(reeses);

    }
}
