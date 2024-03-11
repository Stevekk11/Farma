import java.util.ArrayList;

public class Farm {
    protected ArrayList<Animal> animals;
    protected final int MAX_ANIMALS = 20;

    public Farm() {
        this.animals = new ArrayList<>();

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
           throw new RuntimeException("The Fam is full");
       }
    }
}
