public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm(1000);
        Animal cow = new Cow("Mammal", "Alen", Size.BIG, "Must be milked once a day");
        Animal sheep = new Sheep("Mammal", "Ivet", Size.SMALL, "Must be shaved every month");
        Flower rose = new Rose("Rose",100,15,40.41);
        farm.buyAnimal(cow);
        farm.buyAnimal(sheep);
        System.out.println(farm.checkMoney());
        System.out.println(farm.animals);

    }
}