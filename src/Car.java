//Learning constructors in java

public class Car {
    private String brand;
    private String name;
    private int year;

    public Car(String brand,String name,int year){
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("The car you've bought is:"+brand+" "+name+year);
    }

    public static void main(String[] args){
        Car mycar = new Car("MG","Windsor",2024);
        mycar.displayInfo();
    }

}
