import java.util.ArrayList;

public class Farm {
    protected ArrayList<Animal> animals;
    protected ArrayList<Flower> garden;
    protected final int MAX_ANIMALS = 20;
    protected int gardenSize = 100;

    public Farm() {
        this.animals = new ArrayList<>();
        this.garden = new ArrayList<>();
    }
    public void addAnimal(Animal a){
        animals.add(a);
    }
    public void removeAnimal(Animal a){
        animals.remove(a);
    }
    public void addPlant(Flower f){
        garden.add(f);
        gardenSize -= f.neededArea;
        if (gardenSize == 0){
            throw new RuntimeException("Garden is already full");
        }
    }

    public void checkFullness(){
       int smallAnimals = 0;
       int bigAnimals = 0;
       for (Animal animal : animals){
           if (animal.getSize() == Size.BIG){
               bigAnimals++;
           } else smallAnimals++;
       }
       if (bigAnimals >MAX_ANIMALS/2 || smallAnimals>MAX_ANIMALS/2){
           throw new RuntimeException("The Farm is full");
       }
    }
    public void checkAnimalsOrPlants(String s){
        switch (s){

        }
    }
}
