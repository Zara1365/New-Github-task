package CarTask;

public class Car{
  
     public String brand ;
     public String model ;
     public int amountOfFuel;

public Car(String brand,String model,int amountOfFuel){
         this.brand = brand;
         this.model = model;
         this.amountOfFuel = amountOfFuel;
     }
     
     public Car(){
         this.brand = "Kia";
         this.model = "200";
         this.amountOfFuel = 10;
     }
    public void brake(){
        System.out.println("Car is breaking");
    }
    public void accelerate(){
        if(this.amountOfFuel >= 1){
            amountOfFuel--;
            System.out.println("Car is accelerating");
        }
    }
     public void printData(){
         System.out.println("Brand: " + this.brand);
         System.out.println("Model: " + this.model);
         System.out.println("Fuel: " + this.amountOfFuel);
     }
}
