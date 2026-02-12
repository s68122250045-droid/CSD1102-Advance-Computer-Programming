package car;
public class Car implements Vehicle {
private String brand;

public Car(){}

public Car (String brand){

this.brand = brand;
}
// constructors/getters

@Override

public String getBrand() {

return brand;

}

@Override

public String speedUp() {

return "The car is speeding up.";

}

@Override

public String slowDown() {

return "The car is slowing down.";
}
}