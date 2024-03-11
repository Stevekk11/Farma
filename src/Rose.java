public class Rose extends Flower{

    public Rose(String name, double price, double area, double chance) {
        this.name = name;
        this.price = price;
        this.neededArea = area;
        this.chanceOfGrowth = chance;
    }
    @Override
    public void watered(int liters){
        chanceOfGrowth = liters*0.5 + chanceOfGrowth;
    }
}
