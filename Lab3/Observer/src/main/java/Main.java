public class Main {
    public static void main(String[] args) {
        Stock apple = new Stock();

        Investor a = new IndividualInvestor("Nhà đầu tư A");
        Investor b = new IndividualInvestor("Nhà đầu tư B");

        apple.attach(a);
        apple.attach(b);

        apple.setPrice(150.5);
        apple.setPrice(155.0);
    }
}
