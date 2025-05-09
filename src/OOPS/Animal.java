package OOPS;
//Inheritance and method overloading(polymorphism)

public class Animal {
    String name;
    int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
