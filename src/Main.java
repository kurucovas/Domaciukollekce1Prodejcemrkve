//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {public static void main (String [] args) {
    CarrotSellers sellerA = new CarrotSellers(); //first seller
    CarrotSellers sellerB = new CarrotSellers();
    sellerA.setName("Jan Novak");
    sellerB.setName("Peter Dobry");
    System.out.println(sellerA.getName());
    System.out.println(sellerB.getName());
    sellerA.setAddressOfSeller("Jarna 5 Senec");
    sellerB.setAddressOfSeller("Orechova 3 Brezno");

}}