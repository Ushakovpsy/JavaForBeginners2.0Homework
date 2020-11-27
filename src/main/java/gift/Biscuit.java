package gift;

public class Biscuit extends Sweets {

    public String flavour;


    public Biscuit (String name, double weight, double price, String flavour){
        super (name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString(){
        return "Biscuit [" + super.toString() + ", flavour = " + flavour + "]";
    }

}
