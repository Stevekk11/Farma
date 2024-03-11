public class Sheep extends Animal{
    public Sheep(String type, String name, Size size,String special ) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = special;
    }
    @Override
    public void makeSound(){
        System.out.println("Moo");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sheep{");
        sb.append("type='").append(type).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", size=").append(size);
        sb.append(", specialCare='").append(specialCare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
