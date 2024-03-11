import java.util.ArrayList;

public class Farm {
    protected ArrayList<Animal> animals;
    protected ArrayList<Flower> garden;
    protected final int MAX_ANIMALS = 20;
    protected int gardenSize = 100;
    protected int money;

    public Farm(int money) {
        this.animals = new ArrayList<>();
        this.garden = new ArrayList<>();
        this.money = money;
    }

    private void addAnimal(Animal a) {
        animals.add(a);
    }

    public void removeAnimal(Animal a) {
        animals.remove(a);
    }

    private void addPlant(Flower f) {
        garden.add(f);
        gardenSize -= f.neededArea;
        if (gardenSize == 0) {
            throw new RuntimeException("Garden is already full");
        }
    }
    public void buyPlant(Flower flower){
        double cost = 0;
        cost = flower.getPrice();
        money -= cost;
        if (money !=0){
            addPlant(flower);
        } else throw new RuntimeException("NO money");
    }

    public void removePlant(Flower flower) {
        garden.remove(flower);
        gardenSize += flower.neededArea;
    }

    public String caressAnimal(Animal a) {
        a.makeSound();
        return "You cared for: " + a.getName();
    }
    public void buyAnimal(Animal a){
        int cost = 0;
        if (a.getSize() == Size.BIG){
            cost += 200;
        } else if (a.getSize() == Size.SMALL){
            cost+=100;
        }
        money = money-cost;
        if (money !=0){
            addAnimal(a);
        } else throw new RuntimeException("NO MONEYZ");
    }
    public void sellAnimal(Animal a){
        int cost = 0;
        if (a.getSize() == Size.BIG){
            cost -= 200;
        } else if (a.getSize() == Size.SMALL){
            cost-=100;
        }
        money = money+cost;
        removeAnimal(a);
    }
    public int checkMoney(){
        return money;
    }


    public void checkFullness() {
        int smallAnimals = 0;
        int bigAnimals = 0;
        for (Animal animal : animals) {
            if (animal.getSize() == Size.BIG) {
                bigAnimals++;
            } else smallAnimals++;
        }
        if (bigAnimals > MAX_ANIMALS / 2 || smallAnimals > MAX_ANIMALS / 2) {
            throw new RuntimeException("The Farm is full");
        }
    }
}
