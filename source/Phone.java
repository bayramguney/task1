public class Phone {

    public String model;
    public double weight;
    public String color;
    public int button;
    public int price;

    public double priceInturkishCurrency() {
        return price * 5.8;
    }

    public boolean hasButton() {
        if (button > 16) {
            return true;}
            else{
            return false;
        }
    }

}
class phonemain {
    public static void main(String[] args) {
        Phone gadget = new Phone();
        gadget.model = "Iphone";
        gadget.color = "Green";
        gadget.button = 20;
        gadget.price = 600;
        gadget.weight = 0.5;

        System.out.println("priceinturkishlira  "+gadget.priceInturkishCurrency() );
        System.out.println("hasButton  "+gadget.hasButton());

    }
}