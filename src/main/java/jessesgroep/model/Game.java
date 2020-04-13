package jessesgroep.model;

public class Game {

    private long id;
    private String name;
    private boolean VR;
    private double price;

    public Game()  {
    }

    public Game(long id, String name, boolean VR, double price) {
        this.id = id;
        this.name = name;
        this.VR = VR;
        this.price = price;
    }

    public long getId(){return id;}
    public void setId(long id){this.id = id;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public boolean getVR(){return VR;}
    public void setVR(boolean VR){this.VR = VR;}
    public double getPrice() {return price;}
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be below zero");
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Game{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", VR=").append(VR);
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
