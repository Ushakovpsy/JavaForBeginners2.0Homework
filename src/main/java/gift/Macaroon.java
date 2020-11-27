package gift;

public class Macaroon extends Sweets {

    public String color;


    public Macaroon (String name, double weight, double price, String color){
        super (name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Macaroon [" + super.toString() + ", color = " + color + "]";
    }

}
