public class Sheep extends Animal{
    public Sheep() {
        size = Size.BIG;
        type = "mammal";
        name = "Ivet";
        specialCare = "Must be shaven every week";
    }
    public void makeSound(){
        System.out.println("Moo");
    }
}
