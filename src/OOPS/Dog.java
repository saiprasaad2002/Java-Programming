package OOPS;

public class Dog extends Animal{
    String breed;
    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed = breed;
    }

    public void bark(){
        System.out.println(name+" is barking!!");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    public String getBreed(){
        return breed;
    }
    public static void main(String[] args){
        Dog dog = new Dog("Tommy",7,"German Shepherd");
        dog.eat();

    }
}
